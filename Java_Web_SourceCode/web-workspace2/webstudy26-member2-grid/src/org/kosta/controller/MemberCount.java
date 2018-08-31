package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class MemberCount implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
			int count = MemberDAO.getInstance().count();
			
			request.setAttribute("count", count);
		return "member/login_ok.jsp";
	}

}
