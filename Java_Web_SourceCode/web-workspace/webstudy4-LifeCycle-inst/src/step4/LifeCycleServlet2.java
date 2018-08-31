package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet2
 */
public class LifeCycleServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;    
    public LifeCycleServlet2() {    
    	System.out.println(getClass().getName()+" 객체 생성");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init() 실행");
    }
    // instance variable 
    private int count;//0으로 초기화 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service계열의 doGet() 실행");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<h2>LifeCycleServlet2 instance variable count:");
		out.println(++count);
		out.println("</h2>");
		out.close();
	}
	@Override
	public void destroy() {
		System.out.println("destroy() 실행");
	}
}



















