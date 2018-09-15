package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.MemberService;

public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext("ioc.xml");
		MemberService ms  = 
				(MemberService) container.getBean("memberService"); // dependency lookup (DL)
		ms.registerMemberAndPoint("아이유 정보", 100);
		System.out.println(container.getBean("memberService"));
		System.out.println(container.getBean("memberService"));
		System.out.println(container.getBean("memberService"));
		// 스프링 컨테이너는 싱글톤으로 객체를 운영한다. 
		container.close();
	}
}
