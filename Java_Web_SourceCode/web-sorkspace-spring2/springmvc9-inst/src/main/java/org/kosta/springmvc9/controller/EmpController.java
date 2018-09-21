package org.kosta.springmvc9.controller;

import javax.annotation.Resource;

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
	public String empHome(Model model) {
		model.addAttribute("deptList", deptDAO.getAllDeptList());
		return "emp_home";
	}
	@RequestMapping("findEmpListByDeptNo.do")
	public ModelAndView findEmpListByDeptNo(String deptNo) {
		return new ModelAndView("emp_list",
				"empList",empDAO.findEmpListByDeptNo(deptNo));
	}
	@RequestMapping("findEmpListLikeName.do")
	public ModelAndView findEmpListLikeName(String ename) {
		return new ModelAndView("emp_list",
				"empList",empDAO.findEmpListLikeName(ename));
	}
	@RequestMapping("findEmpListNameAndDeptNo.do")
	public ModelAndView findEmpListNameAndDeptNo(EmpVO paramVO) {
		return new ModelAndView("emp_list",
				"empList",empDAO.findEmpListNameAndDeptNo(paramVO));
	}
}

















