package test;
/*
 * Nested class : 중첩 클래스 
 * 클래스 내부에 클래스를 정의 
 * Outer 외부 클래스의 private member 변수 또는 메서드에 바로 접근 가능하다. 
 */
class Outer{
	private int moeny = 100;
	//Nested Class ( Inner class )
	class Inner{
		public void innerTest() {
			//Outer class 의 private 변수에 바로 접근 가능 
			System.out.println(moeny);
		}
	}
}
public class TestNestedClass {

}
