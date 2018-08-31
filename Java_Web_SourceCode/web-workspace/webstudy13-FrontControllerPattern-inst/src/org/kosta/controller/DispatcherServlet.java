package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/front")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 *  client의 요청사항을 분석 ( command ) 
		 */
		String command=request.getParameter("command");
		System.out.println("command:"+command);
		String viewName=null;
		boolean isRedirect=false;
		if(command.equals("getMemberTotalCount")) {
			request.setAttribute("totalCount", 10);
			viewName="count_view.jsp";
		}else if(command.equals("findProductById")) {
			request.setAttribute("productInfo", "갤럭시9 200");
			viewName="findProductById_result.jsp";
		}else if(command.equals("registerMember")) {
			viewName="register_member_result.jsp";
			isRedirect=true;
		}
		if(isRedirect)
			response.sendRedirect(viewName);
		else	
		request.getRequestDispatcher(viewName).forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doDispatch(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doDispatch(request, response);
	}
}





