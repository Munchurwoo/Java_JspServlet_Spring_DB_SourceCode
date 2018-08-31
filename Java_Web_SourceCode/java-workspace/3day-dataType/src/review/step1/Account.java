package review.step1;

public class Account {
	// instance variable : 객체의 속성 정보를 저장하는 변수 
	private String name;
	private int balance;
	
	//getter method 
	public String getName() {
		return name;
	}
	//setter method 
	// String name : local varible - 메서드 실행시 시행되는 임시 변수 
	public  void setName(String name) {
		// this : 현재 객체 instance를 가르킨다. 
		// this를 쓰는 이유는 instance variable 와 local variable를 구분하기 위해 사용 
		this.name=name;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int Balance) {
		this.balance = Balance;
	}
}
