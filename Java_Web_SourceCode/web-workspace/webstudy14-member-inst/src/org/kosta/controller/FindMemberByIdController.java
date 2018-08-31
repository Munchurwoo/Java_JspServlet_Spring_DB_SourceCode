package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;

public class FindMemberByIdController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("memberId");
		MemberVO vo=MemberDAO.getInstance().findMemberById(id);
		if(vo==null) {
			return "findbyid_fail.jsp";
		}else {
			request.setAttribute("memberVO", vo);
			return "findbyid_ok.jsp";
		}
	}
}




