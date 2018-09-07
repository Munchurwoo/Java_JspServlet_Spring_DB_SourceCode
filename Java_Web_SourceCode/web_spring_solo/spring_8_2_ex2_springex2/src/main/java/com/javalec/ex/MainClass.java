package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection app = ctx.getBean("admin",AdminConnection.class);
		
		System.out.println(app.getAdminId());
		System.out.println(app.getSubAdminId());
		ctx.close();
	}
}
