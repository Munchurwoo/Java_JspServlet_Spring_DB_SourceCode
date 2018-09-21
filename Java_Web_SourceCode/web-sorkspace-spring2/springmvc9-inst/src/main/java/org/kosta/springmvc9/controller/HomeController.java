package org.kosta.springmvc9.controller;

import javax.annotation.Resource;

import org.kosta.springmvc9.model.dao.DeptDAO;
import org.kosta.springmvc9.model.dao.EmpDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	@Resource
	private DeptDAO deptDAO;
	@Resource
	private EmpDAO empDAO;
	/* 첫 메인 화면을 제공할 때 
	 * 부서수와 사원수 정보를 할당한다 
	 * 
	 */
	@RequestMapping("home.do")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		mv.addObject("deptCount", deptDAO.getDeptCount());
		mv.addObject("empCount", empDAO.getEmpCount());
		return mv;
	}
}














