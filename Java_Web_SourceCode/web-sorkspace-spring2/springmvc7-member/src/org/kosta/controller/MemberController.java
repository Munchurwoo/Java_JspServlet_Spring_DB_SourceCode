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
		//MemberVO vo = memberDAO.findMemberById(id);
		//return vo;
		return memberDAO.findMemberById(id);
	}
	@RequestMapping("getAddressKind.do")
	@ResponseBody
	public List<String> getAddressKind() {
		return memberDAO.getAddressKind();
	}
	@RequestMapping("getInfoByAddress.do")
	@ResponseBody
	public List<MemberVO> getInfoByAddress(String address){
		return memberDAO.getInfoByAddress(address);
	}
	@PostMapping("login.do")
	public String login(MemberVO memberVO, HttpSession session) {
		String loc = null;
		MemberVO vo = null;
		vo = memberDAO.login(memberVO);
		if(vo==null)
			loc = "login_fail";
		else 
			loc = "redirect:home.do";
			session.setAttribute("vo", vo);
		return loc;
	}
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:home.do";
	}
	@RequestMapping("updateMemberForm.do")
	public String updateMemberForm(HttpSession session) {
		if(session.getAttribute("vo")==null)
			return "redirect:home.do";
		
		return "update_member_form";
	}
	@PostMapping("updateMember.do")
	public String updateMember(MemberVO memberVO,HttpSession session) {
		MemberVO vo = memberDAO.update(memberVO);
		session.setAttribute("vo", vo);
		return "redirect:updateMemberResult.do";
	}
	@RequestMapping("updateMemberResult.do")
	public String updateMemberResult(HttpSession session) {		
		return "update_member_result";
	}
	@RequestMapping("registerMemberForm.do")
	public String registerMemberForm() {
		return "register_member_form";
	}
	@RequestMapping("register_member.do")
	public String register_member(MemberVO memberVO,HttpSession session) {
		String viewName="null";
		MemberVO vo = memberDAO.findMemberById(memberVO.getId());
		if(vo==null) {
			viewName ="register_ok";
			MemberVO dvo = memberDAO.register(memberVO);
			session.setAttribute("dvo", dvo);
		}else {
			session.setAttribute("dvo", memberVO.getId());
			viewName ="register_fail";
		}
		return viewName;
	}
}
