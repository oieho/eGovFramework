package egovframework.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	@Resource
	private SampleDAO sampleDAO;
	private String version;
	

	public void setSampleDAO(SampleDAO sampleDAO) {
		System.out.println("---> setSampleDAO() 호출");
		this.sampleDAO = sampleDAO;
	}

	public void setVersion(String version) {
		System.out.println("---> setVersion() 호출");
		this.version = version;
	}

	
	/* (non-Javadoc)
	 * @see egovframework.sample.service.impl.SampleService#insertSample()
	 */
	@Override
	public void insertSample() throws Exception {
		sampleDAO.insertSample();
	}
	
	/* (non-Javadoc)
	 * @see egovframework.sample.service.impl.SampleService#updateSample()
	 */
	@Override
	public void updateSample() throws Exception {
		sampleDAO.updateSample();
	}
	
	/* (non-Javadoc)
	 * @see egovframework.sample.service.impl.SampleService#deleteSample()
	 */
	@Override
	public void deleteSample() throws Exception {
		sampleDAO.deleteSample();
	}
	
	/* (non-Javadoc)
	 * @see egovframework.sample.service.impl.SampleService#selectSample()
	 */
	@Override
	public void selectSample() throws Exception {
		sampleDAO.selectSample();
	}
	
	/* (non-Javadoc)
	 * @see egovframework.sample.service.impl.SampleService#selectSampleList()
	 */
	@Override
	public void selectSampleList() throws Exception {
		sampleDAO.selectSampleList();
	}
}
