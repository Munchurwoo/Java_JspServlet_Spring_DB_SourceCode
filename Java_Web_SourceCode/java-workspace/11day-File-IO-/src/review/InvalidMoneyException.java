package review;

public class InvalidMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidMoneyException() {
		super("잘못된 금액입니다. ");
		
	}
	//생성자 오버로딩 
	public InvalidMoneyException(String message) {
		super(message);
	}
}
