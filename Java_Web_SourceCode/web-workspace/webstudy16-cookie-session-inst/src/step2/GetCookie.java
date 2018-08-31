package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookie
 */
@WebServlet("/GetCookie")
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<h3>GetCookie 서블릿에서 클라이언트측에 저장된 쿠키를 반환</h3>");
		// client에 저장된 쿠키를 얻는다 
		Cookie[] cookies=request.getCookies();
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
				if(cookies[i].getName().equals("myInfo")) {
					out.println("myInfo cookie value:"+cookies[i].getValue());
				}
			}
		}else {
			out.println("쿠키가 존재하지 않습니다");
		}
		out.println("<br><br><a href=SetCookie>SetCookie 서블릿으로</a>");
		out.close();
	}
}














