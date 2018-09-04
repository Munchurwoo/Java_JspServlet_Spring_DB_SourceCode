package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class FindMemberByAddressController implements Controller {	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String address=request.getParameter("address");
		ArrayList<MemberDTO> list=
				MemberDAO.getInstance().findMemberListByAddress(address);
		// 구조화된 데이터로 응답하기 위해 json 을 이용한다 
		JSONArray array=new JSONArray(list);
		//Ajax 응답 데이터를 할당 
		request.setAttribute("responsebody", array);
		//Ajax 방식으로 응답하기 위해 AjaxView를 리턴 
		return "AjaxView";
	}
}











