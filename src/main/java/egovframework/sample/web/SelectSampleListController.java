package egovframework.sample.web;

import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;

//@Controller
public class SelectSampleListController {
	
//	@RequestMapping(value="/selectSampleList.do")
	public ModelAndView selectSampleList(SampleVO vo, SampleDAOJDBC sampleDAO, ModelAndView mav) throws Exception {
		mav.addObject("sampleList", sampleDAO.selectSampleList(vo));
		mav.setViewName("selectSampleList");
//		System.out.println("샘플 목록 검색 처리");
//		// 1. 사용자 입력 정보 추출
//		
//		// 2. DB 연동 처리
//		SampleVO vo = new SampleVO();
//		SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
//		List<SampleVO> sampleList = sampleDAO.selectSampleList(vo);
//
//		// 3. 검색 결과를 ModelAndView에 저장하고 목록 화면으로 이동한다.
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("sampleList", sampleList);
//		mav.setViewName("selectSampleList");
		return mav;
	 
		
	}
}