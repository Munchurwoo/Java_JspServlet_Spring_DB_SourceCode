package step10;
//부모 클래스가 명시되어 있지 않은 클래스는 자동으로 extends Object 가 삽입 
class A{  // extends Object 
	A(){super();}
}
class B extends A{
	B(){super();}
}
class C extends B{
	C(){super(); }
}
public class TestObject {
	public static void main(String[] args) {
		// A class 는 Object class를 상속받고 있다 
		new C(); //Object-> A -> B - > C  순서로 객체 생성 
		
	}
}








