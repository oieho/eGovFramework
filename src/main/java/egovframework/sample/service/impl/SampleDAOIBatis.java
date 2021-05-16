package egovframework.sample.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDAO;

//@Repository("daoIBatis")
public class SampleDAOIBatis implements SampleDAO {
	public SampleDAOIBatis(){
		System.out.println("===> SampleDAOiBatis 생성");
	}
	
	public void insertSample() throws Exception {
		System.out.println("===> iBatis로 insertSample() 기능 처리");
	}
	
	public void updateSample() throws Exception {
		System.out.println("===> iBatis로 updateSample() 기능 처리");
	}
	
	public void deleteSample() throws Exception {
		System.out.println("===> iBatis로 deleteSample() 기능 처리");
	}
	
	public void selectSample() throws Exception {
		System.out.println("===> iBatis로 selectSample() 기능 처리");
	}
	
	public void selectSampleList() throws Exception {
		System.out.println("===> iBatis로 selectSampleList() 기능 처리");
	}
}
