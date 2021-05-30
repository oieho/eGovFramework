package egovframework.sample.web;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;

//@Controller
public class SelectSampleController {
	
	@RequestMapping(value="/selectSample.do")
	public ModelAndView selectSample(SampleVO vo, SampleDAOJDBC sampleDAO, ModelAndView mav) throws Exception {
//		System.out.println("샘플 상세 조회 처리");
//		
//		// 1. 사용자 입력 정보 추출
//		String id = request.getParameter("id");
//		
//		// 2. DB 연동 처리
//		SampleVO vo = new SampleVO();
//		vo.setId(id);
//		
//		SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
//		SampleVO sample = sampleDAO.selectSample(vo);
//
//		// 3. 검색 결과를 ModelAndView에 저장하고 목록 화면으로 이동한다.
//		ModelAndView mav = new ModelAndView();
		mav.addObject("sample", sampleDAO.selectSample(vo));
		mav.setViewName("selectSample");
		return mav;
	}
}