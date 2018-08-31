package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class IdCheckController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		if(MemberDAO.getInstance().idCheck(id))
			return "idcheck_fail.jsp";
		else
			return  "idcheck_ok.jsp";
	}

}
