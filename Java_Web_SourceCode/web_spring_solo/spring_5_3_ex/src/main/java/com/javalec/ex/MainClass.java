package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation="classpath:PancilBean.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Pancil pancil =ctx.getBean("pancil",Pancil.class);
		pancil.use();
		ctx.close();
	}

}
