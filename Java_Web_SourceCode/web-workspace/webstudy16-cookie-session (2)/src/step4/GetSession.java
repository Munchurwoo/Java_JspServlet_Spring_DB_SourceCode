package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetSession
 */
@WebServlet("/GetSession")
public class GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		// getSession(false) : 없으면 null 리턴 
		HttpSession session=request.getSession(false);
		if(session!=null && session.getAttribute("userName")!=null) {
			String userName=(String)session.getAttribute("userName");
			out.println(userName+" 세션에서 정보를 반환<br><br>");
		}else {
			out.println("세션이 없음");
		}
		out.println("<a href=session-test.jsp>session test jsp로 이동</a>");
		out.close();
	}
}








