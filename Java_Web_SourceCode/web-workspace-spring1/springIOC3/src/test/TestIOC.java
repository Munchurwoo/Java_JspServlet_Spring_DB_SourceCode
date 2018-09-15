package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Person;

public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("ioc.xml");
		Person p =(Person)factory.getBean("p");
		System.out.println(p.getName());
		p.getTicket().ticketing();
		factory.close();
		
	}
}
