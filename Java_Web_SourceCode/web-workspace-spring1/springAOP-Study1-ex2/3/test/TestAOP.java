package test;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kosta.model.InventoryException;
import kosta.model.PersonService;
import kosta.model.ProductService;

public class TestAOP {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=
				new ClassPathXmlApplicationContext("spring-config.xml");
		PersonService person=(PersonService) factory.getBean("personService");
		ProductService product=(ProductService)factory.getBean("productService");
		person.registerPerson();
		person.insertId("java");
		System.out.println(person.getNick());
		System.out.println(product.getMaker());
		product.registerProduct();
		product.insertProduct("java", "갤럭시8");
		try {
			product.sellProduct(-7);
		} catch (InventoryException e) {
			System.out.println("예외 전달받아 메인에 처리~~~");
			System.out.println("main:"+e.getMessage());
		}
		try {
			product.buyProduct(-1);
		} catch (SQLException e) {
			System.out.println("buy 에서 SQLException ~~");
		}
		factory.close();
	}
}















