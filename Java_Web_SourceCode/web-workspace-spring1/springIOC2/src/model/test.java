package model;

public class test {
	public static void main(String[] args) {
		Person p = new Person();
		p.setTicket(new KalTicket());
		p.setName("문철우");
		
		System.out.print(p.getName()+"님이 ");
		p.getTicket().ticketing();
		System.out.println("을 진행 완료 했습니다.");
	}
}
