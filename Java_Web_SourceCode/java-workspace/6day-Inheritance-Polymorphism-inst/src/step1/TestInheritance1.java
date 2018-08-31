package step1;
class Animal{
	//private access modifier 는 다른 클래스에서 접근 불가 
	//즉 자식클래스도 다른 클래스이므로 직접 접근 불가하다 
	//접근 허용시켜 주고자 한다면 getter, setter를 정의한다 
	private int age=1; //instance variable 
	public void eat() {// method 
		System.out.println("먹다");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
//extends : 부모 클래스 Animal을 상속한다 
//              부모 클래스를 확장해서 자식 클래스를 정의한다 
class Person extends Animal{
	public void study() {
		System.out.println("공부하다");
	}
}
public class TestInheritance1 {
	public static void main(String[] args) {
		Person p=new Person(); // 자식 객체를 생성 
		p.study();// 자신의 메서드이므로 호출가능 
		//상속받았지만 부모 인스턴스 변수의 접근제어자가 private 이므로
		//직접 접근은 불가하고 getter / setter 를 통해 간접 접근을 한다 
		//System.out.println(p.age);
		System.out.println(p.getAge());
		p.eat();//상속받았으므로 사용가능 
	}
}











