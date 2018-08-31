package step5;
/* abstract class : 추상 클래스 
 *  abstract로 선언된 클래스는 직접 객체화 될  수 없다 
 *  abstract로 선언되는 클래스는 자식 클래스들에게 멤버를 물려주고
 *  다형성을 위한 계층구조 형성을 위한 것이다. 
 */
abstract class Parent{
	int money=10;
	Parent(){
		System.out.println("Parent 객체 생성");
	}
	/*
	 *  abstract method : 추상 메서드 
	 *  자식 클래스가 상속받아서 객체로 운용되기 위해서는 
	 *  반드시 추상메서드를 구현해야 한다 
	 *  즉 abstract method는 자식클래스에게 메서드 구현을 강제하는 데 
	 *  목적이 있다 
	 */
	public abstract void study();
}
class Child extends Parent{
	Child(){ //super(); 자동 삽입 
		System.out.println("Child 객체 생성");
	}
	public void study() {
		System.out.println("자식이 열심히 공부하다");
	}
}
public class TestAbstract {
	public static void main(String[] args) {
    // abstract class 는 객체 생성할 수 없다 
	//	Parent p=new Parent();
	// 자식객체 생성시 부모 abstract class 객체가
	// 생성된다 	
		new Child();
	}
}








