package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class UpdateController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession(false);
		//로그인하지 않은 사용자는 index로 보낸다 
		if(session==null||session.getAttribute("memberDTO")==null) {
			return "redirect:index.jsp";
		}else {
			String id=request.getParameter("memberId");
			String password=request.getParameter("memberPassword");
			String name=request.getParameter("memberName");
			String address=request.getParameter("memberAddress");
			MemberDTO dto=new MemberDTO(id,password,name,address);
			MemberDAO.getInstance().updateMember(dto);//db에 회원정보수정 
			session.setAttribute("memberDTO",dto);//session에 회원정보수정 
		}
		return "redirect:member/update_result.jsp";
	}
}








