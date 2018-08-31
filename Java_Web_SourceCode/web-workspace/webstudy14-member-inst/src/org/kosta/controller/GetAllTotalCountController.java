package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;

public class GetAllTotalCountController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int totalCount=MemberDAO.getInstance().getMemberTotalCount();
		request.setAttribute("totalCount", totalCount);
		return "member_count.jsp";
	}

}
