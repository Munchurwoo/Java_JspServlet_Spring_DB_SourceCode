package model;

public class AccountVO {
	private int accountNum;
	private String name;
	private String password;
	private int balance;
	
	public AccountVO(int accountNum, String name, String password, int balance) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public AccountVO() {
		super();
		
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	} 
	
	
}
