package org.kosta.springmvc9.controller;

import javax.annotation.Resource;

import org.kosta.springmvc9.model.dao.DeptDAO;
import org.kosta.springmvc9.model.vo.DeptVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	/*
	 * 첫 메인 화면을 제공할 때 
	 * 부서수 정보를 할당한다.
	 */
	@Resource
	private DeptDAO deptDAO;
	@RequestMapping("home.do")
	public ModelAndView home() {
		
		return new ModelAndView("hello_result","deptCount",deptDAO.getDeptCount());
	}
}
