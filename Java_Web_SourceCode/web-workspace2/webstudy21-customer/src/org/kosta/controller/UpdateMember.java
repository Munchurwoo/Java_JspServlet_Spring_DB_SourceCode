package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class UpdateMember implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null){
			return "redirect:index.jsp";
		}
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");;
		String address = request.getParameter("address");
		
		//데이터 베이스에 업데이트
		MemberVO vo = new MemberVO(id,password,name,address);
		MemberDAO.getInstance().update(id, password, name, address);
		//세션에 저장된 인증정보를 수정 
		session.setAttribute("mvo", vo);
		return "redirect:update_result.jsp";
	}
}
