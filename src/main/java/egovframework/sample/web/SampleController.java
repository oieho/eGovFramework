package egovframework.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;

@Controller
public class SampleController {
	
	@RequestMapping(value="/insertSample.do", method=RequestMethod.GET)
	public String insertSampleView(SampleVO vo) throws Exception {
		System.out.println("등록 화면으로 이동");
		vo.setTitle("SAMPLE 등록입니다.");
		vo.setRegUser("테스터");
		vo.setContent("SAMPLE 등록 테스트 중입니다.");
		return "insertSample";
	}
	
	@RequestMapping(value="/insertSample.do", method=RequestMethod.POST)
	public String insertSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
		System.out.println("등록 처리");
		sampleDAO.insertSample(vo);
		return "forward:selectSampleList.do";
	}
	
	@RequestMapping(value="/updateSample.do")
	public String UpdateSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
		sampleDAO.updateSample(vo);
		return "forward:selectSampleList.do";
	}
	
	@RequestMapping(value="/deleteSample.do")
	public String deleteSample(@RequestParam(value="id", defaultValue="SAMPLE-00001") String sampleId, SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
		System.out.println(sampleId + "번 아이디를 가진 샘플을 삭제한다.");
//		sampleDAO.deleteSample(vo);
		return "forward:selectSampleList.do";
	}
	
	@RequestMapping(value="/selectSample.do")
	public String selectSample(SampleVO vo, SampleDAOJDBC sampleDAO, Model model) throws Exception {
		model.addAttribute("sample", sampleDAO.selectSample(vo));
//		mav.setViewName("selectSample");
		return "selectSample";
	}
	
	@RequestMapping(value="/selectSampleList.do")
	public String selectSampleList(SampleVO vo, SampleDAOJDBC sampleDAO, Model model) throws Exception {
		model.addAttribute("sampleList", sampleDAO.selectSampleList(vo));
//		mav.setViewName("selectSampleList");
		return "selectSampleList";		
	}
	
}
