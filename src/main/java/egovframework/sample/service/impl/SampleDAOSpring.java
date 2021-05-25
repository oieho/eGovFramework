package egovframework.sample.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleVO;
import egovframework.sample.service.common.JDBCUtil;

@Repository("daoSpring")
public class SampleDAOSpring implements SampleDAO {
	@Resource(name="jdbcTemplate")	
	private JdbcTemplate spring;
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	//SQL 명령어들
	private final String SAMPLE_INSERT = "INSERT INTO SAMPLE(ID, TITLE, REG_USER, CONTENT, REG_DATE) VALUES (?, ?, ?, ?, SYSDATE)";
	private final String SAMPLE_UPDATE = "UPDATE SAMPLE SET TITLE=?, REG_USER=?, CONTENT=?, WHERE ID=?";
	private final String SAMPLE_DELETE = "DELETE FROM SAMPLE WHERE ID=?";
	private final String SAMPLE_GET = "SELECT ID, TITLE, REG_USER, CONTENT, REG_DATE FROM SAMPLE WHERE ID=?";
	private final String SAMPLE_LIST = "SELECT ID, TITLE, REG_USER, CONTENT, REG_DATE FROM SAMPLE ORDER BY REG_DATE DESC";
	
	public SampleDAOSpring() {
		System.out.println("===> SampleDAOSpring 생성");
	}
	
	public void insertSample(SampleVO vo) throws Exception {
		System.out.println("===> Spring으로 insertSample() 기능 처리");
		Object[] args = {vo.getTitle(), vo.getRegUser(), vo.getContent()};
		spring.update(SAMPLE_INSERT, args);
	}
	
	public void updateSample(SampleVO vo) throws Exception {
		System.out.println("===> Spring으로 updateSample() 기능 처리");
		Object[] args= {vo.getId(), vo.getTitle(), vo.getRegUser(), vo.getContent(), vo.getId()};
		spring.update(SAMPLE_UPDATE, args);
	}
	
	public void deleteSample(SampleVO vo) throws Exception {
		System.out.println("===> Spring으로 deleteSample() 기능 처리");
		spring.update(SAMPLE_DELETE, vo.getId());
	}

	public SampleVO selectSample(SampleVO vo) throws Exception {
		System.out.println("===> JDBC로 selectSample() 기능 처리");
		SampleVO sample = null;
		conn = JDBCUtil.getConnection();
		stmt = conn.prepareStatement(SAMPLE_GET);
		stmt.setInt(1,  vo.getId());
		rs = stmt.executeQuery();
		if(rs.next()) {
			sample = new SampleVO();
			sample.setId(rs.getInt("ID"));
			sample.setTitle(rs.getString("TITLE"));
			sample.setRegUser(rs.getString("REG_USER"));
			sample.setContent(rs.getString("CONTENT"));
			sample.setRegDate(rs.getDate("REG_DATE"));
		}
		JDBCUtil.close(rs, stmt, conn);
		return sample;
	}
		
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		System.out.println("===> Spring으로 selectSampleList() 기능 처리");
		return spring.query(SAMPLE_LIST,  new SampleRowMapper());
	}
}
