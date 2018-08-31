package step4;

public class TestEncapsulation {
	public static void main(String[] args) {
		Account a=new Account();
//		a.name="아이유";
//		a.balance=100;
		// setter/ getter 로 접근 가능하다. 
		a.setName("아이유");
		a.setBalance(100);
		System.out.println(a.getName());
		System.out.println(a.getBalance());
	}
}
