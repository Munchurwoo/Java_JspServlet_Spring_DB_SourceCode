package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class UpdateMemberController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession(false);
		//로그인 상태가 아닐 때 index.jsp로 이동시킨다 
		if(session==null||session.getAttribute("mvo")==null) {
			return "redirect:index.jsp";
		}		
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		//database 에 회원 정보를 수정 
		MemberVO vo=new MemberVO(id,password,name,address);
		MemberDAO.getInstance().updateMember(vo);
		//세션에 저장된 인증정보(회원객체)를 수정 
		session.setAttribute("mvo", vo);		
		return "redirect:update_result.jsp";
	}
}






