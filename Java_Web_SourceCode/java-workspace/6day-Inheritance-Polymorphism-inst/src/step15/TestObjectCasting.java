package step15;

class Animal{
	public void eat() {
		System.out.println("먹다");
	}
	public void sleep() {
		System.out.println("자다");
	}
}
class Person extends Animal{
	//메서드 오버라이딩 
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
	public void study() {
		System.out.println("사람이 공부하다");
	}
}

public class TestObjectCasting {
	public static void main(String[] args) {
		//부모 타입의 변수로 자식객체를 참조 
		Animal a=new Person();
		a.sleep();//상속받은 부모 메서드이므로 호출 가능 
		a.eat();//오버라이딩한 메서드이므로 호출가능 
		//a.study(); //compile error
		// 위처럼 Person 의 독자적 멤버(메서드)에 접근할 수 없다
		// a 는 부모 타입 Animal 변수이기 때문이다. 
		// 접근해서 호출하기 위해서는 a 변수의 타입을 변경해야 한다 
		// Object casting이 필요 
		((Person) a).study();		
	}
}









