package step9;
class Animal{
	String eye="´« µÎ°³ ";
	public void eat() {
		System.out.println("¸Ô´Ù");
	}
}
class Person extends Animal{
	public void study() {
		System.out.println("°øºÎÇÏ´Ù");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("¸Û¸Û");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.eye);
		p.eat();
		p.study();
	}
}
