package step4;
class MyAccount{
	private int balance=0;
	private int deposit =0;
	private int withdraw=0;
	public void setBalance(int balance) {
		if(balance>0) {
			this.balance=balance;
		}else {
			System.out.println("�ݾ��� 0�� �ʰ��ؾ� �˴ϴ�.");
		}
	}
	public void deposit(int deposit) {
		if(deposit>0){
			balance +=deposit;
		}else {
			System.out.println("�ݾ��� 0���� �ʰ��ؾ� �˴ϴ�.");
		}
	}
	public void withdraw(int withdraw) {
		if(withdraw>balance) {
			System.out.println("�ܾ��� �����Ͽ� ����� �� �����ϴ�. ");
		}else if(withdraw<=0) {
			System.out.println("��� �ݾ��� 0���� �ʰ��ؾ� �մϴ�.");
		}else {
			this.balance -=withdraw;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	public int getDeposit() {
		return balance;
	}
	
}
public class TestIf3 {
	public static void main(String[] args) {
		MyAccount account = new MyAccount();
		account.setBalance(100);
		System.out.println(account.getBalance());
		account.setBalance(0); // �ݾ��� 0���� �ʰ��ؾ� �մϴ�.
		account.setBalance(-100); // �ݾ��� 0���� �ʰ��ؾ� �մϴ�.
		System.out.println(account.getBalance());//100
		System.out.println("-----------�Ա�-----------");
		account.deposit(50);
		System.out.println(account.getBalance());//150
		//�Աݾ��� 0���� �ʰ��ؾ� �� 
		account.deposit(-10);// �߸��� �Աݾ��Դϴ�. 
		account.deposit(20);
		System.out.println(account.getBalance());//170
		System.out.println("-----------���-----------");
		System.out.println("���� �ܾ�: "+account.getBalance());//170
		account.withdraw(30);
		System.out.println("��� �ܾ�: "+account.getBalance());//140
		account.withdraw(-10); // ��ݾ��� 0���� �ʰ��ؾ� �մϴ�. 
		account.withdraw(150);// �ܾ��� �����Ͽ� ����� �� �����ϴ�.
		System.out.println("��� �ܾ�: "+account.getBalance());//140
		
	}
}
