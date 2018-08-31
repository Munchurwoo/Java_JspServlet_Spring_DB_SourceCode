package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class LoginController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		MemberDTO vo=MemberDAO.getInstance().login(id, password);
		String viewName=null;
		if(vo==null) {
			viewName="redirect:login_fail.jsp";
		}else {
			HttpSession session=request.getSession();
			// 세션 생성 후 인증 정보를 할당한다 
			session.setAttribute("mvo", vo);
			viewName="redirect:login_ok.jsp";
		}
		return viewName;
	}
}








