package model;

public class Person {
	private String name;
	private Ticket ticket;
	//생성자를 통해 주입 테스트
	public Person(String name, Ticket ticket) {
		super();
		this.name = name;
		this.ticket = ticket;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}
