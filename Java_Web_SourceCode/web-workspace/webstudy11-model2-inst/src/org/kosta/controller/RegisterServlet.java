package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MockDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerController")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("userId");
		String name=request.getParameter("userName");
		MockDAO.getInstance().insertInfo(id+" "+name);
		// 일단 forward 방식으로 제어를 이동해본다 
		// forward 방식으로 응답할 경우 request,response가 유지되므로
		// 사용자가 재요청을 할 경우 재동작된다는 단점이 있다 
		// 이 경우에는 redirect 방식으로 클라이언트에게 응답하면 된다 
		//request.getRequestDispatcher("register_result.jsp").forward(request, response);
		// client(browser) 에 아래 url 로 이동하여 응답화면을 보개 한다 
		response.sendRedirect("register_result.jsp");	
	}
}

















