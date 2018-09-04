package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		/*MyCalculator  mycal = new MyCalculator();
		mycal.setCal(new calculator());
		mycal.setFirstNum(10);
		mycal.setSecondNum(2);
		
		mycal.add();*/
		String configLocation = "classpath:test.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

		MyCalculator myCalculator = ctx.getBean("MyCalculator",MyCalculator.class);
		
		myCalculator.add();
	}
}
