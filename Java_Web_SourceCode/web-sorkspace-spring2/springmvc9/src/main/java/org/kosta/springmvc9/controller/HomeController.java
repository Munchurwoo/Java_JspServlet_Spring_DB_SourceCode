package org.kosta.springmvc9.controller;

import javax.annotation.Resource;

import org.kosta.springmvc9.model.dao.DeptDAO;
import org.kosta.springmvc9.model.dao.EmpDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	/*
	 * 첫 메인 화면을 제공할 때 
	 * 부서수 정보를 할당한다.
	 */
	@Resource
	private DeptDAO deptDAO;
	@Resource
	private EmpDAO empDAO;
	
	@RequestMapping("home.do")
	public String home(Model model) {
		//int emp = empDAO.getEmpCount();
//		int dept = deptDAO.getDeptCount();
//		System.out.println(empDAO.getEmpCount());
		model.addAttribute("empCount",empDAO.getEmpCount());
		model.addAttribute("deptCount",deptDAO.getDeptCount());
		
		return "home";
	}
}
