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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doDispatch(request,response);
	}	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doDispatch(request,response);
	}
	/*
	 * 	클라이언트의 요청을 분석한다 ( command 를 확인 ) 
	 *  HandlerMapping 을 이용해 실제 컨트롤러 구현체를 반환받고
	 *  실행시킨다. 
	 *  이 때 리턴되는 정보는 이동할 view url 과 
	 *  이동방식(forward or redirect)이다 
	 *  리턴된 정보를 이용해 클라이언트에게 응답하도록 
	 *  처리한다 
	 *  Exception 발생시 error.jsp 로 응답하도록 처리하되 
	 *  콘솔에 로그를 남긴다 
	 */
	private void doDispatch(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException  {
		try {
			String command=request.getParameter("command");
			String url=
			HandlerMapping.getInstance().create(command).execute(request, response);
			if(url.trim().startsWith("redirect:"))
				response.sendRedirect(url.trim().substring(9));
			else
				request.getRequestDispatcher(url).forward(request, response);
			
		}catch (Exception e) {
			e.printStackTrace();			
			response.sendRedirect("error.jsp");		
		}
	}
}














