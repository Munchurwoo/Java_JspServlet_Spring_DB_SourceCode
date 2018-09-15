package kosta.model;

public class InventoryException extends Exception{
	private static final long serialVersionUID = -5858290483290495200L;
	public InventoryException() {}
	public InventoryException(String message){
		super(message);
	}	
}
