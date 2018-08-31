package cafe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.Location;

/**
 * Servlet implementation class EnterServlet
 */
@WebServlet("/EnterServlet")
public class EnterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ArrayList<member> list=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	list = new ArrayList<member>();
    	getServletConfig().getServletContext().setAttribute("list", list);
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		String address = request.getParameter("address");
		String position = request.getParameter("position");
		list.add(new member(name, address, position));
		out.println(name+"님은"+address+"에 거주중이고"+position+"부서입니다.");
		out.println("<br><a href=ListServlet>전체목록보기</a>");
		out.close();
		
	}

}
