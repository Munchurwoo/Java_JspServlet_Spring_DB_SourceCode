package step4;

public class Account {
//	public String name ;
//	public int balance;
//외부( 즉 다른 클래스) 에서 접근할 수 없도록 처리 
		private String name;
		private int balance;
		// setter / getter 로 간접 접근하게 한다. 
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
}
