package org.kosta.springmvc10.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.kosta.springmvc10.model.dao.MemberDAO;
import org.kosta.springmvc10.model.vo.MemberVO;
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
		String viewName=null;
		MemberVO mvo = memberDAO.login(memberVO);
		if(mvo==null)
			viewName="login_fail";
		else 
			viewName="redirect:home.do";
		session.setAttribute("mvo", mvo);
		
		return viewName;
		
	}
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:home.do";
	}
	@RequestMapping("user-findMemberById.do")
	public String findMemberById(String id, Model model) {
		MemberVO vo = memberDAO.findMemberById(id);
		if(vo==null)
			return "find_fail";
		else
			model.addAttribute("vo",vo);
			String viewName="find_ok";
		return viewName;
	}
	@RequestMapping("cafe.do")
	public String cafe(HttpServletRequest request) {
		//아래의 로그인 체크는 Handler Interceptor 에서 
		//공통적으로 처리한다.
		/*HttpSession session = request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null) {
			System.out.println("비로그인 상태이므로 카페입장 불가");
			return "redirect:home.do";
		}*/
		return "cafe";
	}
	@RequestMapping("mypage.do")
	public String mypage(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		/*if(session==null||session.getAttribute("mvo")==null) {
			System.out.println("비로그인 상태이므로 카페입장 불가");
			return "redirect:home.do";
		}*/
		return "mypage";
	}
	
	@RequestMapping("updateMemberForm.do")
	public String updateMemberForm() {
		return "update_member_form";
	}
	@RequestMapping("updateMember.do")
	public String updateMember(MemberVO memberVO, HttpSession session) {
		memberDAO.updateMember(memberVO);
		session.setAttribute("mvo", memberVO);
		return null;
	}
}
