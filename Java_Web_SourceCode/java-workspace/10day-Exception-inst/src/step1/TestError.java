package step1;
/*		java.lang.Throwable  자식 클래스인 Error 를 확인하는 예제 
 *     실행시 발생되는 Error 는 프로그램의 심각한 오류를 말하고
 *     이 경우에는 코드 개선 또는 환경 개선이 필요하다 
 * 
 */
class ErrorEx{
	//고의로 에러를 발생시켜 본다 
	public void a() {
		System.out.println("a 실행");
		b();
	}
	public void b() {
		System.out.println("b 실행");
		a();
	}
}
public class TestError {
	public static void main(String[] args) {
		new ErrorEx().a();
	}
}







