package egovframework.sample.service;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class SampleServiceClient {
	public static void main(String[] args) throws Exception {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-*.xml");
		// 2. Spring 컨테이너로부터 SampleServiceImpl 객체를 Lookup한다.
		SampleService sampleService = (SampleService) container.getBean("sampleService");
		SampleVO vo = new SampleVO();
		vo.setId(0);
		vo.setTitle("임시 제목");
		vo.setRegUser("테스터");
		vo.setContent("임시 내용입니다.....");
		sampleService.insertSample(vo);
		sampleService.selectSample(vo);

		List<SampleVO> sampleList = sampleService.selectSampleList(vo);
		System.out.println("[ Sample LIST ]");
		for (SampleVO sample : sampleList) {
			System.out.println("---> " + sample.toString());
		}
		
		
		sampleService.deleteSample(vo);
		
		// 3. 스프링 컨테이너 종료
		container.close();
	}
}
