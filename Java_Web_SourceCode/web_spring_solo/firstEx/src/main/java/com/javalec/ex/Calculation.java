package com.javalec.ex;

public class Calculation {
	private int firstNum;
	private int secondNum;
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public Calculation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public Calculation(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	public void add() {
		System.out.println("add");
		System.out.println(firstNum+secondNum);
	}
	public void sub() {
		System.out.println("sub");
		System.out.println(firstNum-secondNum);
	}
	public void mult() {
		System.out.println("mult");
		System.out.println(firstNum*secondNum);
	}
	public void div() {
		System.out.println("div");
		System.out.println(firstNum/secondNum);
	}
	
}
