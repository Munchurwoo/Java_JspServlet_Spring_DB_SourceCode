package step1.review;

class Animal{// extends Object 
	// Animal(){super();}
	public void sleep() {
		System.out.println("자다");
	}
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	// 메서드 오버라이딩 : 부모 메서드를 자신에 맞게 구현부를 재정의 
	public void eat() { 
		System.out.println("수저로 먹다");
	}
	public void study() {
		System.out.println("공부하다");
	}
}
public class TestReview {
	public static void main(String[] args) {
		//일반적인 방식으로 객체 생성 
		//Person p=new Person();
		//다형성을 테스트하기 위해 부모 타입의 변수로 자식 객체를 참조 
		Animal a=new Person();
		//최상위 클래스 Object로부터 상속받았으므로 사용가능 
		System.out.println(a.toString());
		a.sleep();//Animal 로부터 상속받았으므로 사용가능 
		a.eat();// 메서드 오버라이딩 했으므로 사용가능 
		//a.study(); // Animal 타입의 변수로 참조했으므로 직접 접근 불가 
		// Object casting 해서 접근하면 된다 
		((Person)a).study();
		AnimalService service=new AnimalService();
		service.pass(new Person());		
	}
}
class AnimalService{
	public void pass(Animal a) {
		System.out.println(a.toString());//상속
		a.sleep();//상속
		a.eat();//오버라이딩 
		if(a instanceof Person) {// instanceof : is a 관계이면 true 
			((Person) a).study();//Person의 독자적 멤버이므로 객체 캐스팅 
		}
	}
}












