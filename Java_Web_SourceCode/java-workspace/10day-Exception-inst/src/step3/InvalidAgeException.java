package step3;
/*  Exception Ŭ������ ���� 
 *  ����� ���� ���� Ŭ���� ����� 
 */
public class InvalidAgeException extends Exception{
	private static final long serialVersionUID = 4606001480844065202L;
	public InvalidAgeException() {
		super("�߸��� ���� �����Դϴ�");
	}
	public InvalidAgeException(String message) {
		super(message);
	}	
}





