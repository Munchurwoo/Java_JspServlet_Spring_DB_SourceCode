package step2;

import org.kosta.bank.KostaBank;

class AccessExam extends KostaBank{
	public void test() {
	/*	KostaBank bank=new KostaBank();
		bank.testPublic();*/
		testPublic();
		//상속받았으므로 다른 팩키지의 클래스의 
		//protected method도 접근해서 사용가능 
		testProtected();
		// default 와 private 접근 제어자 메서드는 당연히 
		// 사용할 수 없다 ( 팩키지가 다르므로 )
	}
}
public class TestAccessModifier {
	public static void main(String[] args) {
		
	}
}



