package review;

public class InvalidMoneyException extends Exception{
	private static final long serialVersionUID = 5074098843972576277L;
	public InvalidMoneyException() {
		super("�߸��� �ݾ� �����Դϴ�");
	}
	//������ �����ε� 
	public InvalidMoneyException(String message) {
		super(message);
	}
}
