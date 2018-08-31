package step2.test;

import step2.model.CreditCard;

/*
 * 생성자 ( Constructor ) 를 정의하고 테스트하는 예제 
 */
public class TestConstructor {
	public static void main(String[] args) {
		/*
		 * CreditCard : 클래스명이자 데이터타입 
		 * c : 변수 , 참조변수, 객체를 참조하는 변수 
		 * = : 할당 assign 
		 * new : 객체 생성시 사용하는 키워드 
		 * CreaditCard() : 생성자 Constructor
		 */
		//CreditCard 클래스에 매개변수가 명시된 생성자가 있으므로 데이터를 할당해야 한다.
		//	CreditCard c = new CreditCard(); . error

		CreditCard c = new CreditCard("아이유 1등급");
		System.out.println(c.getInfo());
	}
}
