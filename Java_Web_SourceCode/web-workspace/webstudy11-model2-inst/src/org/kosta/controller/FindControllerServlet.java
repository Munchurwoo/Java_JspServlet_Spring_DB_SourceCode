package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MockDAO;

/**
 * Servlet 2.5 버전대에는 web.xml 의 url-pattern에 
 * 명시한 url을 Servlet 3 버전에서는 
 * 어노테이션 기반으로 명시할 수 있다 
 */
@WebServlet("/findController")
public class FindControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 실행");
		String id=request.getParameter("id");
		MockDAO dao=MockDAO.getInstance();
		String info=dao.findInfoById(id);
		String viewName=null;
		if(info==null) {			
			viewName="find_fail.jsp";
		}else {			
			//검색결과를 View가 사용할 수 있도록 할당한다 
			request.setAttribute("result", info);
			viewName="find_ok.jsp";
		}
		//ControllerServlet에서 View로 제어를 이동시킨다 
		request.getRequestDispatcher(viewName).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}








