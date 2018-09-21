package org.kosta.controller;

import javax.annotation.Resource;

import org.kosta.model.dao.CustomerDAO;
import org.kosta.model.vo.CustomerVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@Resource
	private CustomerDAO customerDAO;
	@RequestMapping("findCustomerById.do")
	public ModelAndView findCustomerById(String id) {
		CustomerVO vo=(CustomerVO) customerDAO.findCustomerById(id);
		if(vo==null)
			return new ModelAndView("find_fail");
		else
			return new ModelAndView("find_ok","customerVO",vo);
	}
}