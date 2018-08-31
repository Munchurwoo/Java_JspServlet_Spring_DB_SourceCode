package step5;

interface Flyer{
	String NAME="";//인스턴스 변수는 정의 불가하고 
	// 위와 같이 선언하면 static final modifier가 자동으로 삽입 
	//상수로 저장된다. 
	public void fly(); // abstract 를 명시하지 않아도 자동으로 삽입 
	// public void test() {}; // interface 는 구현부가 있는 메서드를 정의 x 
}
class Animal{}
class Bird extends Animal implements Flyer{
	//상위 인터페이스가 선언한 추상 메서드를 구현해야 한다. 
	@Override
	public void fly() {
		System.out.println("새가 날다.");
	}}
class Airplane implements Flyer{
	public void fly() {
		System.out.println("비행기가 날다.");
	}
}
public class TestInterface1 {
	public static void main(String[] args) {
		// new Flyer(); // interface는 객체 생성을 할 수 없다. 
		Flyer f1 = new Bird();
		f1.fly();
		// 상위 인터페이스 타입의 변수로 하위 객체 참조 가능 
		Flyer f2 = new Airplane();
		// 상위 인터페이스 타입의 배열에 하위 객체 요소로 저장 가능 

		Flyer[] fa= {new Bird(),new Airplane()};
		for(int i=0;i<fa.length;i++) {
			fa[i].fly();
		}
	}
}
