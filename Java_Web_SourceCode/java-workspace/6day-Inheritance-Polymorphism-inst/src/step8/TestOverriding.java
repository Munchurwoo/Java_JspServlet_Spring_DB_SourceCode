package step8;
//메서드 오버라이딩 테스트 예제 
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	//메서드 오버라이딩 : 자신에 맞게 구현부를 재정의 
	@Override //어노테이션 : 의미있는 주석 
	// 오버라이딩 문법을 체크하는 어노테이션 
	public  void eat() {
		//만약 부모 메서드를 호출해서 사용하고 싶다면 
		//super keyword 를 이용하면 된다 
		super.eat();
		System.out.println("사람이 수저로 먹다");
	}
}
class Dog extends Animal{}
public class TestOverriding {
		public static void main(String[] args) {
			Dog dog=new Dog();
			dog.eat(); //상속받은 부모 eat() 이 실행 
			Person person=new Person();
			person.eat();// 오버라이딩한 자신의 eat() 이 실행된다 
		}
}










