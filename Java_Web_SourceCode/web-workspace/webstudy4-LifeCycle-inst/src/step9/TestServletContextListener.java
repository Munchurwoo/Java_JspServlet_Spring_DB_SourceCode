package step9;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class
 * TestServletContextListener
 *
 */
public class TestServletContextListener implements ServletContextListener {
	// 웹어플리케이션 처음 실행시 웹컨테이너에 의해 한번 실행된다 
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("TestServletContextListener contextInitialized");
	}
	// 웹어플리케이션 종료 직전 웹컨테이너에 의해 한번 실행된다 
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("TestServletContextListener contextDestroyed");
	}
}






