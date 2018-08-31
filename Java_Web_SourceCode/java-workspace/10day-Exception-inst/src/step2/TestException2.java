package step2;
/*	TestException1 은 프로그램이 비정상종료되었다 
 * TestException2 는 Exception Handling(예외처리) 을 통해 
 * 프로그램 실행시 Exception 이 발생해도 대안흐름을 실행하고
 * 프로그램을 정상적으로 실행되도록 처리했다 
 */
public class TestException2 {
	public static void main(String[] args) {
		String name=null;
		try { //try: Exception 발생 예상 영역을 지정 
			System.out.println(name.length());
		//catch : Exception 발생시 대안흐름을 실행 ( 예외처리 ) 	
		}catch(NullPointerException e) {
			System.out.println("대안흐름실행:null이므로 길이를 구할 수 없음");
		}
		System.out.println("프로그램 정상수행");
	}
}



