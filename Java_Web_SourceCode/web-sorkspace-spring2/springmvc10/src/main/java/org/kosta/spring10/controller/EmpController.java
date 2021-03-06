package org.kosta.spring10.controller;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.spring10.model.dao.EmpDAO;
import org.kosta.spring10.model.vo.EmpVO;
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
		model.addAttribute("empNo",empDAO.getEmpNo());
		return "index";
	}
	
	@RequestMapping("empList.do")
	public ModelAndView empList(String empNo) {
		return new ModelAndView("emp_list","emp",empDAO.getEmpList(empNo));
	}

}
