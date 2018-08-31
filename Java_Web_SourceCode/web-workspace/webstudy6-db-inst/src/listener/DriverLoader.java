package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class DriverLoader
 *
 */
public class DriverLoader implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public DriverLoader() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
    	String driver=event.getServletContext().getInitParameter("driver");
    	try {
    		// db driver 는 시스템에서 단 한번 수행하면 되므로 
    		// ServletContextListener의 contextInitialized에서 실행하게 한다 
			Class.forName(driver);
			System.out.println("db driver loading");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
    	
    }
	
}











