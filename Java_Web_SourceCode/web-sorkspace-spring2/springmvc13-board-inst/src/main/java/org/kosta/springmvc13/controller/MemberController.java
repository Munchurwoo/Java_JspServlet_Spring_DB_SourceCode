package org.kosta.springmvc13.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.kosta.springmvc13.model.service.MemberService;
import org.kosta.springmvc13.model.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Resource
	private MemberService memberService;	
	@PostMapping("login.do")
	public String login(HttpServletRequest request, MemberVO vo) {		
		MemberVO rvo = memberService.login(vo);
		if (rvo != null) {
			HttpSession session=request.getSession();
			session.setAttribute("mvo", rvo);	
			//조회수 체크를 위해 noList를 추가한다 
			session.setAttribute("noList",new ArrayList<Integer>());
		}
		return "member/login_result";
	}	
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:list.do";
	}	
}





