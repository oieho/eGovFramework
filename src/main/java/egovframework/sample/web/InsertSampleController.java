package egovframework.sample.web;

import javax.servlet.http.HttpServletRequest;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;

//@Controller
public class InsertSampleController {
	
//	@RequestMapping(value="/insertSample.do")
	public String insertSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
		System.out.println("샘플 등록 처리");
		
//		// 1. 사용자 입력 정보 추출
//		String title = request.getParameter("title");
//		String regUser = request.getParameter("regUser");
//		String content = request.getParameter("content");
//		
//		// 2. DB 연동 처리
//		SampleVO vo = new SampleVO();
//		vo.setTitle(title);
//		vo.setRegUser(regUser);
//		vo.setContent(content);
//		
//		SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
		sampleDAO.insertSample(vo);
		return "forward:selectSampleList.do";
		
	}
}