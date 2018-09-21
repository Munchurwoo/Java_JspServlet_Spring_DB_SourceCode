package org.kosta.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.kosta.model.dao.MemberDAO;
import org.kosta.model.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	@Resource
	private MemberDAO memberDAO;
	@RequestMapping("findMemberById.do")
	@ResponseBody
	public MemberVO findMemberById(String id) {		
		return memberDAO.findMemberById(id);
	}
	@RequestMapping("findMemberListByAddress.do")
	@ResponseBody
	public List<MemberVO> findMemberListByAddress(String address){
		return memberDAO.findMemberListByAddress(address);
	}
	@PostMapping("login.do")
	public String login(MemberVO memberVO,HttpSession session) {
		String viewName=null;
		MemberVO mvo=memberDAO.login(memberVO);
		if(mvo==null) {
			viewName="login_fail";
		}else {
			viewName="redirect:home.do";
			session.setAttribute("mvo", mvo);
		}
		return viewName;
	}
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:home.do";
	}
	@RequestMapping("updateMemberForm.do")
	public String updateMemberForm(HttpSession session) {
		if(session.getAttribute("mvo")==null) {
			return "redirect:home.do";
		}
		return "update_member_form";
	}
	@PostMapping("updateMember.do")
	public String updateMember(MemberVO memberVO,HttpSession session) {
		memberDAO.updateMember(memberVO);
		session.setAttribute("mvo", memberVO);
		return "redirect:updateMemberResult.do";
	}
	@RequestMapping("updateMemberResult.do")
	public String updateMemberResult() {
		return "update_member_result";
	}
	@RequestMapping("registerMemberForm.do")
	public String registerMemberForm() {
		return "register_member_form";
	}
	@PostMapping("registerMember.do")
	public String registerMember(MemberVO memberVO) {
		memberDAO.registerMember(memberVO);
		return "redirect:registerMemberResult.do";
	}
	@RequestMapping("registerMemberResult.do")
	public String registerMemberResult() {
		return "register_member_result";
	}
	@RequestMapping("checkId.do")
	@ResponseBody
	public String checkId(String id) {
		return (memberDAO.checkId(id)==0)?"ok":"fail";
	}
}























