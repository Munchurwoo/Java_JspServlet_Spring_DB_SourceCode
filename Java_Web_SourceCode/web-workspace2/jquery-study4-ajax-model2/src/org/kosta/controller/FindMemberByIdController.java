package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class FindMemberByIdController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		String id=request.getParameter("id");
		MemberDTO dto=MemberDAO.getInstance().findMemberById(id);
		String result=null;
		if(dto==null)
			result="회원 정보가 없습니다";
		else
			result="이름:"+dto.getName()+" 주소:"+dto.getAddress();
		//클라이언트에게 ajax 방식으로 응답할 정보를 할당한다 
		request.setAttribute("responsebody", result);
		//AjaxView를 리턴해서 Ajax 방식으로 페이지가 아니라 
		//필요한 데이터만 응답하도록 한다 
		return "AjaxView";
	}
}











