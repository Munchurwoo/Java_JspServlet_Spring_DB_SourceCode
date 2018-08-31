package model;

public class AccountNotFoundException extends Exception {
	private static final long serialVersionUID = -2964134848203606702L;

	public AccountNotFoundException(String message) {
		super(message);		
	}
}
