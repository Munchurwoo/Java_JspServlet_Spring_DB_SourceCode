package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SynServlet
 */
@WebServlet("/SynServlet")
public class SynServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SynServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//서버에서 처리시간이 많이 소요되었다고 가정 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();		
		String  a = request.getParameter("userInfo");
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println("SynServlet이 응답했습니다!");
		out.println(a);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}










