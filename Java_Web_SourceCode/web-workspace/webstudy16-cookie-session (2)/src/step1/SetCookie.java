package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookie
 */
@WebServlet("/SetCookie")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<h3>SetCookie 서블릿에서 클라이언트측으로 쿠키전달</h3>");
		Date date=new Date();
		out.println("현재시간정보:"+date.toString());
		out.println("<br><br><a href=GetCookie>GetCookie 서블릿에서 확인</a>");
		//Cookie 생성 
		//Cookie value에 스페이스 즉 빈공간을 주면 exception 발생 
		Cookie cookie=new Cookie("myInfo","kosta-"+date.toString().replace(" ","-"));
		//쿠키 유효시간을 설정 ( 30초간 유지 ) 
		//만약 쿠키 유효시간을 설정하지 않으면 해당 브라우저 실행시에만 
		//쿠키가 유효하다 
		cookie.setMaxAge(30);
		
		//client 측으로 쿠키를 전송 
		response.addCookie(cookie);		
		out.close();
	}
}


















