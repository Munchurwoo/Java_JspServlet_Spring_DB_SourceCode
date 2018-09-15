package test;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
//Spring과 MyBatis Framework 연동 테스트 
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext("ioc.mybatis.xml");
		/*System.out.println(container.getBean("dbcp"));
		container.close();*/
//		System.out.println(container.getBean("sqlSessionFactoryBean"));
		System.out.println(container.getBean("sqlSessionTemplate"));
		container.close();
	}
}
