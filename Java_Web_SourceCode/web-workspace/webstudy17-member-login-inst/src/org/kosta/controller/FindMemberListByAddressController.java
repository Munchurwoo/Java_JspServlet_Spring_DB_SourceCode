package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberListByAddressController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String address=request.getParameter("address");
		ArrayList<MemberVO> list=
				MemberDAO.getInstance().findMemberListByAddress(address);
		if(list.isEmpty()) {
			return "findbyaddress_fail.jsp";
		}else {
			request.setAttribute("list", list);
			return "findbyaddress_ok.jsp";
		}		
	}
}







