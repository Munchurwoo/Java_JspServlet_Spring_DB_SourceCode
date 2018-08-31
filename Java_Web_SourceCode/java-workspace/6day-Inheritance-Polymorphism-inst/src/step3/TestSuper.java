package step3;
// super keyword 의 용법을 확인하는 예제 
// super() : 생성자의 첫 실행라인에 위치하고 
//				  부모 생성자를 호출하여 부모 객체를 생성한다 
class Animal{ // 부모 클래스 
	Animal(){
		System.out.println("부모 클래스 Animal 생성자 실행 즉 Animal객체 생성");
	}
}
class Person extends Animal{
	Person(){ //super();//만약 super() 를 명시하지 않으면 컴파일러가 자동삽입
		System.out.println("자식 클래스 Person 생성자 실행 즉 Person 객체 생성");
		//super(); // compile error .. super() 는 반드시 생성자 첫라인에 위치해야
		//한다 
	}
}
public class TestSuper {
	public static void main(String[] args) {
		new Person(); // 자식 객체를 생성해본다 
	}
}









