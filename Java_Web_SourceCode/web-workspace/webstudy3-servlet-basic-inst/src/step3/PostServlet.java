package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet{
	private static final long serialVersionUID = -1654356486347188029L;
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//post 요청방식일 때는 request 에 대한 한글 인코딩 정보 등록이 필요
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println(this.getServletName()+" 응답합니다");
		out.println("<hr>");
		out.println("방명록 내용:");
		//<input type="text" name="guestBook">
		String info=request.getParameter("guestBook");
		out.println(info);
		out.close();
	}
}









