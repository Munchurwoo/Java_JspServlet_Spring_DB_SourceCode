package org.kosta.controller;

import javax.annotation.Resource;

import org.kosta.model.dao.MemberDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Resource
	private MemberDAO memberDAO;
	@RequestMapping("home.do")
	public String home(Model model) {
		model.addAttribute("totalMemberCount",
				memberDAO.getTotalMemberCount());
		model.addAttribute("addressList", 
				memberDAO.getAddressKind());
		return "index"; //views/index.jsp 가 응답 
	}
}





