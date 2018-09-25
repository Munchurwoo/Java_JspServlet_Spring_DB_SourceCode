package org.kosta.springmvc13.controller;

import javax.annotation.Resource;

import org.kosta.springmvc13.model.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Resource
	private BoardService boardService;
	@RequestMapping("home.do")
	public ModelAndView home() {	
		return new ModelAndView("board/list","lvo",boardService.getPostList());
	}
}
