package org.kosta.controller;

import javax.annotation.Resource;

import org.kosta.model.dao.MemberDAO;
import org.kosta.model.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@Resource
	private MemberDAO memberDAO;
	@RequestMapping("home.do")
	public String home(Model model) {
		int tno = memberDAO.getTotalMemberCount();
		model.addAttribute("totalMemeberCount", tno);
		model.addAttribute("addressList", memberDAO.getAddressKind());
		return "index";
	}

}
