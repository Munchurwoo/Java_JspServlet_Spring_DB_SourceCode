package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterMemberController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// forward가 아니라 redirect방식으로 이동시키기 위해 
		// 서두에 redirect: 을 추가해서 리턴한다 
		return "redirect:register_member_result.jsp";
	}

}






