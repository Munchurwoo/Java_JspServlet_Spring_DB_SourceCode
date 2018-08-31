package step4;
class MyAccount{
	private int balance=0;
	private int deposit =0;
	private int withdraw=0;
	public void setBalance(int balance) {
		if(balance>0) {
			this.balance=balance;
		}else {
			System.out.println("금액은 0을 초과해야 됩니다.");
		}
	}
	public void deposit(int deposit) {
		if(deposit>0){
			balance +=deposit;
		}else {
			System.out.println("금액은 0원을 초과해야 됩니다.");
		}
	}
	public void withdraw(int withdraw) {
		if(withdraw>balance) {
			System.out.println("잔액이 부족하여 출금할 수 없습니다. ");
		}else if(withdraw<=0) {
			System.out.println("출금 금액은 0원을 초과해야 합니다.");
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
		account.setBalance(0); // 금액은 0원을 초과해야 합니다.
		account.setBalance(-100); // 금액은 0원을 초과해야 합니다.
		System.out.println(account.getBalance());//100
		System.out.println("-----------입금-----------");
		account.deposit(50);
		System.out.println(account.getBalance());//150
		//입금액은 0원을 초과해야 함 
		account.deposit(-10);// 잘못된 입금액입니다. 
		account.deposit(20);
		System.out.println(account.getBalance());//170
		System.out.println("-----------출금-----------");
		System.out.println("현재 잔액: "+account.getBalance());//170
		account.withdraw(30);
		System.out.println("출금 잔액: "+account.getBalance());//140
		account.withdraw(-10); // 출금액은 0원을 초과해야 합니다. 
		account.withdraw(150);// 잔액이 부족하여 출금할 수 없습니다.
		System.out.println("출금 잔액: "+account.getBalance());//140
		
	}
}
