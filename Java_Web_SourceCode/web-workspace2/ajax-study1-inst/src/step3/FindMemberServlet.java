package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindMemberServlet
 */
@WebServlet("/FindMemberServlet")
public class FindMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();		
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		String id=request.getParameter("id");
		out.println(id+"아이디에 대한 회원검색결과<br>");
		if(id!=null&&id.equals("java")) {
			out.println("이름:아이유 주소:판교");
		}else {
		out.println("회원이 존재하지 않습니다");
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}







