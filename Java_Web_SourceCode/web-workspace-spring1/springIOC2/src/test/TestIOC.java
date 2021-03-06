package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Person;

/*
 * IOC (DL 과 DI 모두 사용)
 */
public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("ioc.xml");
		/*
		 * Person 객체를 DL 즉 , Dependency Lookup 을 통해 
		 * 스프링 컨테이너로부터 반환받는다.
		 */
		
		Person p = (Person) factory.getBean("person");
		System.out.println(p.getName());
		p.getTicket().ticketing();
		factory.close();
	}
}
