package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/front")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*	1. 에러 발생시 메세지를 콘솔에 출력하고 error.jsp로 리다이렉트한다 
	 *  2. client의 request command를 전달받는다 
	 *  3. HandlerMapping 에게 컨트롤러 생성을 위임해서 
	 *     command를 처리할 Handler Controller 객체를 반환받는다 
	 *  4. Handler Controller 객체의 handleRequest 메서드를 호출한다 
	 *  5. 실행 후 반환하는 viewName 정보를 이용해 
	 *  	forward or redirect 방식으로 클라이언트에 응답하도록 한다    
	 */
	protected void doDispatch(HttpServletRequest request,	HttpServletResponse response) throws IOException{
		try {
			String command=request.getParameter("command");
			Controller controller=HandlerMapping.getInstance().create(command);
			String url=controller.handleRequest(request, response).trim();
			if(url.startsWith("redirect:")) {
				response.sendRedirect(url.substring(9));
			}else {
				request.getRequestDispatcher(url).forward(request, response);
			}
		}catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}//catch
	}//method
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doDispatch(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doDispatch(request, response);
	}
}





