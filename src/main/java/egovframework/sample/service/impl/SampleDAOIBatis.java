package egovframework.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleVO;

@Repository("daoIBatis")
public class SampleDAOIBatis implements SampleDAO {
	public SampleDAOIBatis(){
		System.out.println("===> SampleDAOiBatis 생성");
	}
	
	public void insertSample(SampleVO vo) throws Exception {
		System.out.println("===> iBatis로 insertSample() 기능 처리");
	}
	
	public void updateSample(SampleVO vo) throws Exception {
		System.out.println("===> iBatis로 updateSample() 기능 처리");
	}
	
	public void deleteSample(SampleVO vo) throws Exception {
		System.out.println("===> iBatis로 deleteSample() 기능 처리");
	}
	
	public SampleVO selectSample(SampleVO vo) throws Exception {
		System.out.println("===> iBatis로 selectSample() 기능 처리");
	}
	
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		System.out.println("===> iBatis로 selectSampleList() 기능 처리");
	}
}
