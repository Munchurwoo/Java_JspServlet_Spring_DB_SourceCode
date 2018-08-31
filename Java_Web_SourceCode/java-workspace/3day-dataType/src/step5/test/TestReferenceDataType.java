package step5.test;

import review.step2.Person;

public class TestReferenceDataType {
	public static void main(String[] args) {
		int i = 1; // int 는 정수형 primitive data type 
		Person p ; // reference data type 
		p= new Person(); // 객체 생성해서 p에 참조시킨다. 
		// p 는 참조변수 ( reference variable )
		System.out.println(p);
	}
}
