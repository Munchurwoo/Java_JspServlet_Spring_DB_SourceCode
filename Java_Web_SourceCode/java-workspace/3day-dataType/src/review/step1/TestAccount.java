package review.step1;

public class TestAccount {

	public static void main(String[] args) {
		/*
		 *  Account class 를 이용해 객체를 생성한다. 
		 *  변수며은 a1 으로 한다. 
		 */
		Account a1 = new Account();
		//객체 주소값이 출력 
		System.out.println(a1);
		// Account a1 객체의 name을 아이유로 할당해 본다.
		a1.setName("아이유");
		
		// 할당한 name을 출력해본다. 
		System.out.println(a1.getName());
		// 연습 
		a1.setBalance(100);
		System.out.println(a1.getName()+"님의 잔액:"+a1.getBalance());
	}

}
