package org.kosta.controller;
/**
 * 컨트롤러 객체 생성을 전담하는 클래스 
 * : simple factory 
 */
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return instance;
	}
	public Controller create(String command){
		Controller c=null;
		if(command.equals("AllCustomerCount")){
			c=new AllCustomerCountController();
		}else if(command.equals("IdCheck")){
			c=new IdCheckController();
		}else if(command.equals("Register")){
			c=new RegisterController();
		}else if(command.equals("Login")){
			c=new LoginController();
		}else if(command.equals("Logout")){
			c=new LogoutController();
		}else if(command.equals("MyPage")){
			c=new MyPageController();
		}
		return c;
	}
}







