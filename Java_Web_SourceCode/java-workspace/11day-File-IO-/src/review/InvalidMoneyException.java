package review;

public class InvalidMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidMoneyException() {
		super("�߸��� �ݾ��Դϴ�. ");
		
	}
	//������ �����ε� 
	public InvalidMoneyException(String message) {
		super(message);
	}
}
