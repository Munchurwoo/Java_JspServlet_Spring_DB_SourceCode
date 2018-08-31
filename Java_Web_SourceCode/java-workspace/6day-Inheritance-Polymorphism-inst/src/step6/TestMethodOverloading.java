package step6;
//메서드 오버로딩 테스트 예제 
class Person{
	public void eat() {
		System.out.println("먹다");
	}
	//메서드 오버로딩 : 동일한 메서드명으로 
	// 다양한 매개변수의 메서드를 정의 
	public void eat(int count) {
		System.out.println(count+"인분 먹다");
	}	
	public void eat(String menu,int count) {//method overloading
		System.out.println(menu+" "+count+"인분 먹다");
	}
}
public class TestMethodOverloading {
	public static void main(String[] args) {
		Person p=new Person();
		p.eat();
		p.eat(3);
		p.eat("짬뽕", 2);
		// 메서드 오버로딩이 되어서 사용하는 측에서는 하나의 메서드명만 
		// 인지하면 다양한 데이터를 전달해서 처리할 수 있다 
		// 즉 메서드 오버로딩은 사용자 편의성을 위한 프로그래밍 기법이다. 
	}
}












