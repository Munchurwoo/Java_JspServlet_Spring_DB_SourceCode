package review.step1;

public class Account {
	// instance variable : ��ü�� �Ӽ� ������ �����ϴ� ���� 
	private String name;
	private int balance;
	
	//getter method 
	public String getName() {
		return name;
	}
	//setter method 
	// String name : local varible - �޼��� ����� ����Ǵ� �ӽ� ���� 
	public  void setName(String name) {
		// this : ���� ��ü instance�� ����Ų��. 
		// this�� ���� ������ instance variable �� local variable�� �����ϱ� ���� ��� 
		this.name=name;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int Balance) {
		this.balance = Balance;
	}
}
