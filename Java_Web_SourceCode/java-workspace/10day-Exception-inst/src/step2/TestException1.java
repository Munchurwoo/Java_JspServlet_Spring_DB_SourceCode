package step2;

public class TestException1 {
	public static void main(String[] args) {
		String name="아이유";
		System.out.println(name.length());
		name=null;
		//JVM이 실행하다가 name이 null 인 length() 를 호출하는 코드를
		// 실행하는 시점에 
		// java.lang.NullPointerException 을 발생시키고 
		// 프로그램을 중단한다 (비정상 종료)
		System.out.println(name.length());
		System.out.println("프로그램 정상 수행");
	}
}





