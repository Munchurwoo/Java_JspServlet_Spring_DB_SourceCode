package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetSession
 */
@WebServlet("/SetSession")
public class SetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		// 세션 테스트 
		// request.getSession(false) : 기존 세션 반환 , 없으면 null 리턴 
		// 참고로 jsp는 별도의 session 설정이 없으면 기본으로 
		// request.getSession() 코드가 생성되고 실행된다. 
		/*HttpSession session=request.getSession(false);
		out.println(session);*/
		// 기존 세션이 있으면 기존 세션 리턴 , 없으면 새로 생성 
		HttpSession session=request.getSession();//true와 동일 
		// 일정 조건동안 정보를 유지한다 
		// tomcat/conf/web.xml 의 session 유효 시간 설정에 의거하여 
		// 그 시간동안(tomcat 기본 30분) 유지된다 
		session.setAttribute("userName", request.getParameter("userName"));
		out.println("세션에 정보를 할당<br><br>");
		out.println("<a href=GetSession>GetSession 서블릿에서 확인</a>");
		out.close();
	}
}








