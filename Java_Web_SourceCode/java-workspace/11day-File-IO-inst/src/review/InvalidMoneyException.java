package review;

public class InvalidMoneyException extends Exception{
	private static final long serialVersionUID = 5074098843972576277L;
	public InvalidMoneyException() {
		super("잘못된 금액 정보입니다");
	}
	//생성자 오버로딩 
	public InvalidMoneyException(String message) {
		super(message);
	}
}
