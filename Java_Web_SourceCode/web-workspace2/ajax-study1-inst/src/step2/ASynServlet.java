package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ASynServlet
 */
@WebServlet("/ASynServlet")
public class ASynServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ASynServlet() {
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
				//ajax 통신 방식은 기존 방식과 같이 페이지 전체를
				//응답하는 것이 아니라 필요한 데이터만 응답한다 
				out.println("ajax 응답하라 오바");
				out.close();
	}
}















