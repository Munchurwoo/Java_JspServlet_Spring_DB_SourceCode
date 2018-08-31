package cafe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Member> list;
	  @SuppressWarnings("unchecked")
	@Override
	public void init() throws ServletException {
		list=(ArrayList<Member>)getServletConfig().getServletContext().getAttribute("list");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<h3>카페입장명단</h3>");
		for(int i=0;i<list.size();i++) {
			out.println((i+1)+"."+list.get(i).getNick()+" "+list.get(i).getAddress()+"<br>");
		}
		out.println("<br><br><a href=enter.html>홈으로</a>");
		out.close();
	}
}














