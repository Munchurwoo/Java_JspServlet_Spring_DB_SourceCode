package step9;
class Animal{
	String eye="�� �ΰ� ";
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	public void study() {
		System.out.println("�����ϴ�");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("�۸�");
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
