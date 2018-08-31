package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 8167282340257269204L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// client에 응답할 컨텐트 타입을 지정
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h2>" + this.getServletName() + "</h2>");
		String userName = request.getParameter("userName");
		out.println("사용자 이름은 " + userName);
		out.println("<hr>");
		String userAddress = request.getParameter("userAddress");
		out.println("사용자 주소는 " + userAddress);
		out.close();
	}
}
