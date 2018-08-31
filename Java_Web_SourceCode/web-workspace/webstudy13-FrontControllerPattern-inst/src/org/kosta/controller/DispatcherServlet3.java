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
@WebServlet("/front3")
public class DispatcherServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 *  client의 요청사항을 분석 ( command ) 
		 */
		String command=request.getParameter("command");
		System.out.println("command:"+command);
		String viewName=null;
		Controller controller=HandlerMapping.getInstance().create(command);		
		try { // 계층구조 형성을 통한 다형성 적용되므로 
			//모든 컨트롤러들을 단일한 방식으로 제어할 수 있다 
			viewName=controller.handleRequest(request, response).trim();		
			if(viewName.startsWith("redirect:"))
				response.sendRedirect(viewName.substring(9));
			else	
				request.getRequestDispatcher(viewName).forward(request, response);
		} catch (Exception e) {					
			e.printStackTrace();
			//문제 발생시 클라이언트에게는 점검중 페이지로 이동시킨다
			response.sendRedirect("error.jsp");
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doDispatch(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doDispatch(request, response);
	}
}





