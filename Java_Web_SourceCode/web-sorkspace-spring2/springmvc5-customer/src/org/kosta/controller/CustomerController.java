package org.kosta.controller;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.model.dao.CustomerDAO;
import org.kosta.model.vo.CustomerVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	// CustomerDAO를 DI
	@Resource
	private CustomerDAO customerDAO;

	@RequestMapping("findCustomerById.do")
	public ModelAndView findCustomerById(String id) {
		CustomerVO vo = customerDAO.findCustomerById(id);
		ModelAndView mv = new ModelAndView();
		if (vo == null)
			// return new ModelAndView("find_customer_fail");
			mv.setViewName("find_customer_fail");
		else {
			// return new ModelAndView("find_customer_ok", "cvo", vo);
			mv.setViewName("find_customer_ok");
			mv.addObject("cvo", vo);
		}
		return mv;
	}

	@RequestMapping("findCustomerByAddress.do")
	public String findCustomerByAddress(String address, Model model) {
		String viewName = null;
		List<CustomerVO> list = customerDAO.findCustomerByAddress(address);
		if (list.isEmpty()) {
			viewName = "findbyaddress_customer_fail";
		} else {
			viewName = "findbyaddress_customer_ok";
			model.addAttribute("list", list);
		}
		return viewName;
	}

	@PostMapping("registerCustomer.do")
	public String registerCustomer(CustomerVO vo) {
		String viewName = null;
		CustomerVO cvo = customerDAO.findCustomerById(vo.getId());
		if (cvo == null) {
			customerDAO.registerCustomer(vo);
			//redirect : 재동작 방지를 위해 리다이렉트 방식으로 응답
			//등록된 고객정보를 결과하면에서 보여주기 위해 
			//컨트롤러 메서드 주소로 redirect 한다 
			System.out.println(vo.getId());
			viewName = "redirect:registerCustomerResult.do?id="+vo.getId();
			
		} else {
			
			viewName = "redirect:views/duplicated_result.jsp";
		}
		return viewName;
	}
	@RequestMapping("registerCustomerResult.do")
	public ModelAndView registerCustomerResult(String id) {
		CustomerVO cvo =customerDAO.findCustomerById(id);
		
		return new ModelAndView("register_customer_result","cvo",cvo);
		
	}
}
