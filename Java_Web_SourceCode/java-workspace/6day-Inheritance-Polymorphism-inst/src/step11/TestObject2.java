package step11;
class Company {//extends Object
	private String name="삼성";
	private String address="판교";
	//부모 클래스 Object의 toString() 을 오버라이딩하여 
	//객체의 주소값 반환하는 것 대신 속성 정보를 반환하도록 재정의 
	public String toString() {
		return "name:"+name+" address:"+address;
	}
}
public class TestObject2 {
	public static void main(String[] args) {
		Company c=new Company();
		System.out.println(c.toString());
		// 객체의 참조변수의 주소값을 전달하면 println() 메서드 내에서
		// toString() 을 호출하므로 위의 코드와 같은 결과가 출력된다 
		System.out.println(c);
	}
}








