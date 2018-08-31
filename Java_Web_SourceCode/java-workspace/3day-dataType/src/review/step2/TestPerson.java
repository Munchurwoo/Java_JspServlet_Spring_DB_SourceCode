package review.step2;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("æ∆¿Ã¿Ø");
		p.setAge(26);
		System.out.println(p.getName()+""+p.getAge());
	}
}
