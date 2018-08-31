package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class loginCheck implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberVO vo = MemberDAO.getInstance().loginCheck(request.getParameter("id"), request.getParameter("password"));
		String viewName = null;
		if (vo == null) {
			viewName = "redirect:login_fail.jsp";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("vo", vo);
			viewName = "redirect:login_ok.jsp";
		}
		return viewName;

	}

}
