package review;

public class TestException {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		int money = 10; // �������� ������ 
		money=-1; // ������ �ִ� ������ - ���� �߻� 
		try {
			service.deposit(money);
			System.out.println("c");
		} catch (InvalidMoneyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("d");
//			e.printStackTrace();
		}
		System.out.println("e");
	}
}
