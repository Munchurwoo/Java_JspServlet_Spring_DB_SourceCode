package cafe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EnterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ArrayList<Member> list;
    @Override
    public void init() throws ServletException {
    	list=new ArrayList<Member>();
    	getServletConfig().getServletContext().setAttribute("list", list);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String nick=request.getParameter("nick");
		String address=request.getParameter("address");
		list.add(new Member(nick,address));
		out.println(address+"에 사는 "+nick+"님 카페입장을 환영합니다<br><br>");
		out.println("<br><br><a href=ListServlet>입장명단보기</a>");
		out.close();
	}
}













