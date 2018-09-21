package org.kosta.springmvc10.controller;

import javax.annotation.Resource;

import org.kosta.springmvc10.model.dao.EmpDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@Resource
	private EmpDAO empDAO;
	@RequestMapping("home.do")
	public String home(Model model) {
		model.addAttribute("empNoList", empDAO.getEmpNoList());
		return "index";
	}
	@RequestMapping("findEmpByEmpNo.do")
	public ModelAndView findEmpByEmpNo(String empNo) {
		return new ModelAndView("emp_info","emp",empDAO.findEmpByEmpNo(empNo));
	}
}
