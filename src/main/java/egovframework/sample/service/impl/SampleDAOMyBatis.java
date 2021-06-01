package egovframework.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleVO;

@Repository("daoMyBatis")
public class SampleDAOMyBatis implements SampleDAO {
	@Resource(name = "sampleMapper")
	private SampleMapper mybatis;
	
//	public class SampleDAOMyBatis extends EgovAbstractMapper implements SampleDAO {
	public SampleDAOMyBatis(){
		System.out.println("===> SampleDAOMyBatis 생성");
	}
	
	public void insertSample(SampleVO vo) throws Exception {
		System.out.println("===> MyBatis로 insertSample() 기능 처리");
		mybatis.insertSample(vo);
	}
	
	public void updateSample(SampleVO vo) throws Exception {
		System.out.println("===> MyBatis로 updateSample() 기능 처리");
		mybatis.updateSample(vo);
	}
	
	public void deleteSample(SampleVO vo) throws Exception {
		System.out.println("===> MyBatis로 deleteSample() 기능 처리");
		mybatis.deleteSample(vo);
	}
	
	public SampleVO selectSample(SampleVO vo) throws Exception {
		System.out.println("===> MyBatis로 selectSample() 기능 처리");
		return (SampleVO) mybatis.selectSample(vo);
	}
	
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		System.out.println("===> MyBatis로 selectSampleList() 기능 처리");
			return mybatis.selectSampleList(vo);
	}
}
