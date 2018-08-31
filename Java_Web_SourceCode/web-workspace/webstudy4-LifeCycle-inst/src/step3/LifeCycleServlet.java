package step3;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
public class LifeCycleServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	// client가 처음 요청할 때 한번 생성된다 
	public LifeCycleServlet() {	
		System.out.println("LifeCycleServlet 객체 생성");
	}
	// client가 처음 요청시 단 한번 실행된다 
	public void init(ServletConfig config) throws ServletException {		
		System.out.println("init 실행");
	}
	// client 요청시마다 매번 실행된다 
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service 실행");
	}
	// WAS 가 종료되기 전 한번 실행된다 
	public void destroy() {		
		System.out.println("destroy 실행");
	}
}












