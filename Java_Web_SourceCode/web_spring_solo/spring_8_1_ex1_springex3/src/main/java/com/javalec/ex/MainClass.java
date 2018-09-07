package com.javalec.ex;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;


public class MainClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env =ctx.getEnvironment();
		MutablePropertySources propertySource = env.getPropertySources();
		
		try {
			propertySource.addLast(new ResourcePropertySource("admin.properties"));
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GenericXmlApplicationContext gctx = (GenericXmlApplicationContext)ctx;
		gctx.load("applicationCTX.xml");
		gctx.refresh();
		AdminConnection adminConnection =gctx.getBean("adminConnection",AdminConnection.class);
		System.out.println("환경설정 구문 출력");
		System.out.println(adminConnection.getId());
		System.out.println(adminConnection.getPw());
		
		ctx.close();
		gctx.close();
	}
}
