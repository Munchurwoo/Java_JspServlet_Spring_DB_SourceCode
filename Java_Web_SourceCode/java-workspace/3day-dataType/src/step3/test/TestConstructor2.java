package step3.test;

import step3.model.MyDate;

public class TestConstructor2 {
	public static void main(String[] args) {
		
		MyDate d = new MyDate(7,11);
		
		System.out.println(d.getMonth());//7
		System.out.println(d.getDay());//11
	}
}
