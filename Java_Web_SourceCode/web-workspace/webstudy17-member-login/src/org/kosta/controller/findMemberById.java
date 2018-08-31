package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class findMemberById implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberVO vo = MemberDAO.getInstance().findMemberById(request.getParameter("memberId"));
		
		if(vo==null) {
			return "FindbyId_fail.jsp";
		}else {
			request.setAttribute("MemberVO", vo);
			return "Member_detail.jsp";
		}
	}

}
