package model;

public class NotMatchedPasswordException extends Exception{
	private static final long serialVersionUID = 5628642488426527596L;
	public NotMatchedPasswordException(String message){
		super(message);
	}
}
