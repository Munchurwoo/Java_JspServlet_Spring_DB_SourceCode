package org.kosta.springmvc9.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.kosta.springmvc9.model.dao.DeptDAO;
import org.kosta.springmvc9.model.dao.EmpDAO;
import org.kosta.springmvc9.model.vo.EmpVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	
	@Resource
	private DeptDAO deptDAO;
	@Resource
	private EmpDAO empDAO;
	
	@RequestMapping("empHome.do")
	public String home(Model model) {
		model.addAttribute("deptNo",deptDAO.getAllDeptList());
		return "emp_home";
	}
	@RequestMapping("findEmpListByDeptNo.do")
	public String findEmpListByDeptNo(HttpServletRequest request, Model model) {
		int a = Integer.parseInt(request.getParameter("deptNo"));
		model.addAttribute("list",empDAO.findEmpListByDeptNo(a));
		return "emp_list";
	}
	@RequestMapping("findEmpListNameAndDeptNo.do")
	public ModelAndView findEmpListLikeName(EmpVO paramVO) {
		return new ModelAndView("emp_list","emp",empDAO.findEmpListNameAndDeptNo(paramVO));
		
	}
}
