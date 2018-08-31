package step6.test;

import step6.model.Friend;

//참조 변수에 대한 예제 
public class TestReferenceVariable {
	public static void main(String[] args) {
		/*
		 * Friend : reference data type 
		 * f : reference variable 
		 * = :assign 할당 
		 * new : 객체생성시 사용하는 키워드 
		 * Friend() : Constructor 생성자 
		 */
		Friend f  = new Friend("아이유");
		// 생성자에 의한 초기화가 마지막에 수행되므로 손흥민이 아니라 아이유가 출력 
		System.out.println(f.getName());
		//인스턴스 변수의 명시적인 초기화된 1이 출력 
		System.out.println(f.getAge());
		// 선언만 되었으므로 int형의 기본값 0이 출력 
		System.out.println(f.getMoney());
		System.out.println(f.getAddress());
		
	}
}
