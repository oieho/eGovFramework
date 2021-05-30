package egovframework.sample.web;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;

//@Controller
public class DeleteSampleController {

//	@RequestMapping(value="/deleteSample.do")
	public String deleteSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
//		System.out.println("샘플 삭제 처리");
//		
//		// 1. 사용자 입력 정보 추출
//		String id = request.getParameter("id");
//		
//		// 2. DB 연동 처리
//		SampleVO vo = new SampleVO();
//		vo.setId(id);
//		
//		SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
		sampleDAO.deleteSample(vo);
//		
//		// 3. 화면 네비게이션
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("forward:selectSampleList.do");
		return "forward:selectSampleList.do";
	}
}
