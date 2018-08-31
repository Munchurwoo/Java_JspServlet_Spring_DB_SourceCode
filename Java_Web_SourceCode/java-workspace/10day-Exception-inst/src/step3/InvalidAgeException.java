package step3;
/*  Exception 클래스를 정의 
 *  사용자 정의 예외 클래스 만들기 
 */
public class InvalidAgeException extends Exception{
	private static final long serialVersionUID = 4606001480844065202L;
	public InvalidAgeException() {
		super("잘못된 나이 정보입니다");
	}
	public InvalidAgeException(String message) {
		super(message);
	}	
}





