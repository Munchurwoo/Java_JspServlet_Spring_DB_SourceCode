package org.kosta.controller;

/**
 * client의 요청을 처리할 컨트롤러 구현객체 생성을
 * 전담하는 factory 객체 
 * @author KOSTA
 *
 */
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return instance;
	}
	public Controller create(String command){
		Controller controller=null;
		if(command.equals("Home")){
			controller=new HomeController();
		}else if(command.equals("Login")) {
			controller=new LoginController();
		}else if(command.equals("Logout")) {
			controller=new LogoutController();
		}else if(command.equals("ItemDetail")) {
			controller=new ItemDetailController();
		}else if(command.equals("RegisterItemForm")) {
			controller=new RegisterItemFormController();
		}else if(command.equals("RegisterItem")) {
			controller=new RegisterItemController();
		}else if(command.equals("AddItemToCart")) {
			controller=new AddItemToCartController();
		}else if(command.equals("DeleteItemFromCart")) {
			controller=new DeleteItemFromCartController();
		}else if(command.equals("CartView")) {
			controller=new CartViewController();
		}
		return controller;
	}
}






















