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
		if(command.equals("findMemberById")){
			controller=new FindMemberByIdController();
		}else if(command.equals("findKindOfAddress")) {
			controller=new FindKindOfAddressController();
		}else if(command.equals("findMemberByAddress")){
			controller=new FindMemberByAddressController();
		}else if(command.equals("login")) {
			controller=new LoginController();
		}else if(command.equals("logout")) {
			controller=new LogoutController();
		}else if(command.equals("update")) {
			controller=new UpdateController();
		}else if(command.equals("register")){
			controller=new RegisterController();
		}else if(command.equals("idcheck")){
			controller=new IdCheckController();
		}
		return controller;
	}
}






















