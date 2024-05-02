package com.shop.project.controller;

import com.shop.project.dto.SampleDto;
import com.shop.project.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SampleController {
    @Autowired
    private SampleService sampleService;


	//R
    @RequestMapping("/sample")
	public ModelAndView sampleLi() throws Exception {
		ModelAndView mv = new ModelAndView("/sample/list");
		List<SampleDto> sample = sampleService.selectSampleList();
		mv.addObject("sample", sample);
		return mv;
	}

	//C
	@RequestMapping(value = "/sample/write", method = RequestMethod.GET)
	public String insertSample() throws Exception {
		return "/sample/write";
	}

	@RequestMapping(value = "/sample/write", method = RequestMethod.POST)
	public String insertSample(SampleDto sample) throws Exception {
		sampleService.insertSample(sample);
		return "redirect:/sample";
	}
	//D
//	@RequestMapping(value = "/shop/qnaDelete/{QnaIdx}", method = RequestMethod.DELETE)
//	public String deleteQnaList(@PathVariable("QnaIdx") int QnaIdx) throws Exception {
//		QnaService.deleteQna(QnaIdx);
//		return "redirect:/sample";
//	}



}
