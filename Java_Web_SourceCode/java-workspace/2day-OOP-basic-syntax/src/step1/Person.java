/*
 *  패키지 선언부 : clas를 디렉토리별로 분류해서 관리 
 *  					   패키지는 소문자로 명시 
 *  					   
 */
package step1;
/*
 * 클래스 선언부 : class는 object의 설계도 
 * public : 접근 제어자 access modifier  가장 넓은 범위의 접근 제어자 
 * 접근 제어자의 종류는 
 * public > protected > default > private 
 * public : 어디서나 접근 가능 
 * protected : 팩키지 내에서 접근가능  단, 상속관계시에는 다른 패키지에서도 접근 가능 
 * default : 동일한 패키지 내에서만 접근 가능 
 * private : 다른 클래스에서 접근 불가 
 * 
 * person은 class 명, 클래스명은 대문자로 시작 
 * 합성어의 첫글자는 대문자, 나머지는 소문자 
 * ex) MyHouse 
 * 
 */
public class Person {
	/*
	 * 변수 ( variable or attribute ) 를 선언 
	 * -> 변수는 객체의 속성 정보를 저장하기 위해 선언 
	 */
	
	public String name;
	public int age;
	/*
	 * 메서드: 객체의 기능을 정의 
	 * public : 접근 제어자 
	 * void : 리턴 값이 없을 때 명시하는 자바키워드 
	 * eat : 메서드명, 변수명 규칙과 동일 
	 * 소문자로 구성, 합성어의 첫글자는 대문자 
	 * ex) findMemberInfoById  
	 */
	public void eat() {
		System.out.println(name+"님이 먹었습니다.");
	}
	/*int time  :  메서드의 매개변수 
	*메서드를 호출한 측에서 전달한 데이터를 받기 위한 변수 
	*void : 메서드가 데이터를 리턴하지 않을 떄 명시하는 키워드 
	*이 메서드는 리턴값이 없다 라는 표현 
	*/
	public void sleep(int time) {
		System.out.println(name+"님이"+time+"시간 자다");
	}
	public void study(String subject, int time) {
		System.out.println(name+"님이"+subject+" "+time+"시간 공부하다.");
	}
	/*
	 * String : 리턴할 데이터의 타입 
	 * 리턴 타입이라고 한다. 
	 */
	public String getDetailInfo() {
		return "이름: "+name+" 나이:"+age;
	}
}
