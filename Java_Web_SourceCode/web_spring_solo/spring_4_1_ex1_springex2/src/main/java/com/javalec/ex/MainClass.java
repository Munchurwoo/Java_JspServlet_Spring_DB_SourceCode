package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		String configLocation="classpath:applicationCTX.xml";
		AbstractApplicationContext ctx =new GenericXmlApplicationContext(configLocation);
		MyInfo myinfo= ctx.getBean("myinfo",MyInfo.class);
		myinfo.getInfo();
		
	}
	
}
