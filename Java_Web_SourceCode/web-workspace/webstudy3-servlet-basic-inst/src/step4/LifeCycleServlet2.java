package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet2
 */
@WebServlet({ "/LifeCycleServlet2", "/life" })
public class LifeCycleServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleServlet2() {
    System.out.println("객체생성");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init 생성");
    }
    @Override
    public void destroy() {
    	System.out.println("destroy 생성");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    	private int count;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("service 계열의 doGet() 실행");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h2>LifeCycleServlet2 instance variable count : ");
		out.println(++count);
		out.println("</h2>");
		out.close();	
	}
}
