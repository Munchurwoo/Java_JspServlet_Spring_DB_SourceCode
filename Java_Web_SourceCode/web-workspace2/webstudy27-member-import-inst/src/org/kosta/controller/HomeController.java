package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class HomeController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("memberTotalCount",
				MemberDAO.getInstance().getAllMemberCount());
		request.setAttribute("url", "/home.jsp");
		return "/template/layout.jsp";
	}
}







