package model;

public class AccountVO {
	private String id;
	private String name;
	private int balance;
	public String getNo() {
		return id;
	}
	public void setNo(String no) {
		this.id = no;
	}
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
	public AccountVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AccountVO [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public AccountVO(String no, String name, int balance) {
		super();
		this.id = no;
		this.name = name;
		this.balance = balance;
	}
	
	
}
