package org.kosta.controller;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.model.dao.CustomerDAO;
import org.kosta.model.vo.CustomerVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	//CustomerDAO를 DI
	@Resource
	private CustomerDAO customerDAO;
	@RequestMapping("findCustomerById.do")
	public ModelAndView findCustomerById(String id) {
		CustomerVO vo = customerDAO.findCustomerById(id);
		ModelAndView mv = new ModelAndView();
		if(vo == null)
			//return new ModelAndView("find_customer_fail");
			mv.setViewName("find_customer_fail");
		else {
			//return new ModelAndView("find_customer_ok", "cvo", vo);
			mv.setViewName("find_customer_ok");
			mv.addObject( "cvo", vo);
		}
		return mv;
	}
	@RequestMapping("findCustomerByAddress.do")
	public String findCustomerByAddress(String address, Model model) {
		String viewName = null;
		List<CustomerVO> list = customerDAO.findCustomerByAddress(address);
		if(list.isEmpty()) {
			viewName = "findbyaddress_customer_fail";
		}else {
			viewName = "findbyaddress_customer_ok";
			model.addAttribute("list", list);
		}
		return viewName;
	}
}