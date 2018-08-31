package step3;

abstract class Parent {
	int money = 100; // instance variable

	public void eat() { // method ( ������ �޼��� )
		System.out.println("�Դ�");
	}

	// �ڽ� Ŭ�������� ������ ������ �� �ִ�.
	// �θ� �������� ���� �� �� ���� ��ɿ� ���� ������ �����Ѵ�.
	public abstract void study();
}

class ChildOne extends Parent {
	// child(){super();}
	public void study() { // �θ� ������ abstract method �� ����
		System.out.println("�����ϴ�.");
	}
}
// �θ��� abstract method �� �������� �ʰ�, abstract class �� �����ϴ� 
// ����� �ִ�. �� ���� �ش� ChildTwo Ŭ������ ���� ��üȭ �� �� 
// ���� ������ �ִ�.
abstract class ChildTwo extends Parent{}

public class TestAbstract1 {
	public static void main(String[] args) {
		// new Parent(); abstract class �� ���� ��ü ������ �� ����.
		Parent p = new ChildOne();
		System.out.println(p.money);// ��� ���� ���� 
		p.eat(); //��ӹ��� �޼��� 
		p.study(); // �����ε��� �޼��� 
	}
}
