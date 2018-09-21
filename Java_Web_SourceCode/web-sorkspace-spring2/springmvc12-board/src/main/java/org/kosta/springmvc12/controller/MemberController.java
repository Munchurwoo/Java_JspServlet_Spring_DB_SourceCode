package org.kosta.springmvc12.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.kosta.springmvc12.model.dao.MemberDAO;
import org.kosta.springmvc12.model.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Resource
	private MemberDAO memberDAO;

	@PostMapping("user-login.do")
	public String login(MemberVO memberVO, HttpSession session) {
		String viewName = null;
		MemberVO mvo = memberDAO.login(memberVO);
		if (mvo == null)
			viewName = "login_fail";
		else
			viewName = "redirect:home.do";
		session.setAttribute("mvo", mvo);
		return viewName;
	}
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:home.do";
	}

}
