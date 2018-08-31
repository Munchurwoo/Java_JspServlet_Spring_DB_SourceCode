package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class register implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
//		HttpSession session = request.getSession(false);
//		if(session==null||session.getAttribute("mvo")==null){
//			
//			
//		}else {
//			return "rediract:index.jsp";
//		}
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");;
		String address = request.getParameter("address");
		String birthday = request.getParameter("birthday");
		System.out.println(id+"확인용-----------------");
		MemberDTO vo = new MemberDTO(id,password,name,address,birthday,null);
		MemberDAO.getInstance().register(vo);
		
		return "redirect:register_result.jsp";
	}

}
