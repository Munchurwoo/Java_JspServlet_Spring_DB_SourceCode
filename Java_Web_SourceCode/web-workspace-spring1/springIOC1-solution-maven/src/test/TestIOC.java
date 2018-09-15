package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Tool;

/*
 * IOC 기법을 이용하여 도구를 제어해본다.
 */
public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = 
				new ClassPathXmlApplicationContext("ioc.xml");
		//spring ioc container로부터 lookup 방식을 통해 필요로하는 tool 객체를 확보한다. -DL
		Tool tool = (Tool)factory.getBean("tool");
		tool.work();
		factory.close();
	}
}
