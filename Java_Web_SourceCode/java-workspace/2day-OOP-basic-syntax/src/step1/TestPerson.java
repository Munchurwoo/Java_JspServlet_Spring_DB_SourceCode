package step1;
/*
 * Person class를 test 하는 클래스 
 * : Person class를 이용해 Person Object(객체)를 생성하고, Person class의 변수 영역에 
 * 데이터를 할당하는 테스트 및 변수에 저장된 데이터를 출력해보는 예제 
 */
public class TestPerson {
	public static void main(String[] args) {
		//Person class를 이용해 객체object를 생성 
		/*
		 * p : 객체를 참조하는 변수 
		 * 
		 */
		Person p = new Person();
		Person p2 = new Person();
		// 위 라인이 jvm에 의해 실행되면 Person 객체가 메모리에 적재된다. 
		// p 객체의 변수 영역에 데이터를 할당 
		p.name = "손흥민";
		p.age=24; 
		// p 객체에 저장된 name 과 age를 출력해본다. 
		System.out.println("이름:"+p.name);
		System.out.println("나이:"+p.age);
		//eat() 메서드 호출 
		p.eat();
		p.sleep(9);
		System.out.println(p.getDetailInfo());
		/*
		 *  p2 변수명으로 Person 객체를 생성해본다.
		 */
		p2.name="아이유";
		p2.age=26;
		/*
		 * p2 객체에 name 은 아이유, age 는 26을 저장한다. 
		 */
		System.out.println("이름:"+p2.name);
		System.out.println("이름:"+p2.age);
		p2.eat();
		p2.sleep(6);
		p2.study("자바", 6);
		System.out.println(p2.getDetailInfo());
		/*
		 * 저장된 p2 객체의 name과 age 를 출력해본다. 
		 */
	}
}
