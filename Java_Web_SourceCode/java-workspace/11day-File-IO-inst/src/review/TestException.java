package review;
// Exception Handing ���� ���� 
public class TestException {
	public static void main(String[] args) {
		AccountService service=new AccountService();
		int money=10;//�������� ������  
		money=-1;//���� �ִ� ������  - ���� �߻� 
		try {
			service.deposit(money);
			System.out.println("c");
		} catch (InvalidMoneyException e) {			
			System.out.println(e.getMessage());//Exception �޼����� ��� 
		//	e.printStackTrace(); // Excepiton �� ������ ��� 
			System.out.println("d");
		}
		System.out.println("e");
	}
}





