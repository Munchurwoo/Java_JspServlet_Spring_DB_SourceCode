package step3;

abstract class Parent {
	int money = 100; // instance variable

	public void eat() { // method ( 구현된 메서드 )
		System.out.println("먹다");
	}

	// 자식 클래스에게 구현을 강제할 수 있다.
	// 부모 차원에서 구현 할 수 없는 기능에 대한 구현을 강제한다.
	public abstract void study();
}

class ChildOne extends Parent {
	// child(){super();}
	public void study() { // 부모가 선언한 abstract method 를 구현
		System.out.println("공부하다.");
	}
}
// 부모의 abstract method 를 구현하지 않고, abstract class 로 선언하는 
// 방법도 있다. 이 때는 해당 ChildTwo 클래스가 직접 객체화 될 수 
// 없는 제약이 있다.
abstract class ChildTwo extends Parent{}

public class TestAbstract1 {
	public static void main(String[] args) {
		// new Parent(); abstract class 는 직접 객체 생성될 수 없다.
		Parent p = new ChildOne();
		System.out.println(p.money);// 상속 받은 변수 
		p.eat(); //상속받은 메서드 
		p.study(); // 오버로딩한 메서드 
	}
}
