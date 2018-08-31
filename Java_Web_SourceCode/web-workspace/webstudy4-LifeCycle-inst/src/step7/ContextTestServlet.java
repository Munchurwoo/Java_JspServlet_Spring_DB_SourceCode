package step7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//ServletConfig로부터 ServletContext를 반환받아 
		//ServletContext의 초기 파라미터 값인 관리자 이메일을 
		//얻어온다 
		ServletContext context=getServletConfig().getServletContext();
		String email=context.getInitParameter("adminEmail");
		out.println("관리자 이메일:"+email);
		//공유 객체인 ServletContext에 정보를 할당한다 
		context.setAttribute("nickName", "아이유");
		out.println("<br><br><a href=context2>Context2로 이동</a>");
		out.close();
	}
	// 고의로 권장하지 않는 방식으로 init 을 오버라이딩해본다 
	/*@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 오버라이딩");
	}*/
}












