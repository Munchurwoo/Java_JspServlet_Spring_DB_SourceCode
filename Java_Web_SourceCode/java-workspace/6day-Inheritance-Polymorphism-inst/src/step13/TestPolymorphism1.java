package step13;
// ������ �׽�Ʈ ���� 
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Dog extends Animal{}
class Person extends Animal{
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}
}
class Car{}
public class TestPolymorphism1 {
	public static void main(String[] args) {
		//�θ� Animal Ÿ���� ������ �ڽ�Dog ��ü�� ������ �� �ִ� 
		Animal a1=new Dog();
		//�Ʒ� �ڵ�� �ƹ��� ��Ӱ��谡 �����Ƿ� compile error 
		//Animal aa=new Car();
		a1.eat();
		// ��� ���������� �θ�� �ڽ� �����̹Ƿ� 
		//�θ� Ÿ���� ������ �ڽİ�ü�� ������ �� �ִ� 
		Animal a2=new Person();
		a2.eat();
	}
}


















