package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Context2
 */
public class Context2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Context2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//ServletConfig로부터 ServletContext를 반환받아 
		//ServletContext의 초기 파라미터 값인 관리자 이메일을 
		//얻어온다 
		ServletContext context=getServletConfig().getServletContext();
		String email=context.getInitParameter("adminEmail");
		out.println(getServletConfig().getServletName()+" 관리자 이메일:"+email);
		out.println("<br><br>컨텍스트에서 get:"+context.getAttribute("nickName"));
		out.println("<br><br><a href=ContextTestServlet>ContextTestServlet로 이동</a>");
		out.close();
	}

}







