package step4;

public class TestEncapsulation {
	public static void main(String[] args) {
		Account a=new Account();
//		a.name="������";
//		a.balance=100;
		// setter/ getter �� ���� �����ϴ�. 
		a.setName("������");
		a.setBalance(100);
		System.out.println(a.getName());
		System.out.println(a.getBalance());
	}
}
