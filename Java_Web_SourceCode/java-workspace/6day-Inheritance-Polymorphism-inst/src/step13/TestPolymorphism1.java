package step13;
// 다형성 테스트 예제 
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}
class Dog extends Animal{}
class Person extends Animal{
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
}
class Car{}
public class TestPolymorphism1 {
	public static void main(String[] args) {
		//부모 Animal 타입의 변수로 자식Dog 객체를 참조할 수 있다 
		Animal a1=new Dog();
		//아래 코드는 아무런 상속관계가 없으므로 compile error 
		//Animal aa=new Car();
		a1.eat();
		// 상속 계층구조상 부모와 자식 관계이므로 
		//부모 타입의 변수로 자식객체를 참조할 수 있다 
		Animal a2=new Person();
		a2.eat();
	}
}


















