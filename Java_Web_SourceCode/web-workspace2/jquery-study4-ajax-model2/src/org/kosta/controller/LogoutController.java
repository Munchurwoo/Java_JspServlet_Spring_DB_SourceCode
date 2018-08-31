package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getSession(false) : 기존 세션이 있으면 기존 세션 리턴하고 
		//						 없으면 null 반환 
		HttpSession session=request.getSession(false);
		if(session!=null)
			session.invalidate();//세션 사용중지시킨다 
		return "redirect:index.jsp";
	}
}









