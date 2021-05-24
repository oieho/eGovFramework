package egovframework.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;
import egovframework.sample.service.SampleVO;
import egovframework.sample.service.common.SampleAdvice;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	@Resource(name="daoJDBC")
	private SampleDAO sampleDAO;
	private SampleAdvice advice = new SampleAdvice();
	
	public void insertSample(SampleVO vo) throws Exception {
		advice.beforeLogic();
		sampleDAO.insertSample(vo);
	}
	
	public void updateSample(SampleVO vo) throws Exception {
		advice.beforeLogic();
		sampleDAO.updateSample(vo);
	}
	
	public void deleteSample(SampleVO vo) throws Exception {
		advice.beforeLogic();
		sampleDAO.deleteSample(vo);
	}
	

	public SampleVO selectSample(SampleVO vo) throws Exception {
		advice.beforeLogic();
		return sampleDAO.selectSample(vo);
	}
	
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		advice.beforeLogic();
		return sampleDAO.selectSampleList(vo);
	}
}
