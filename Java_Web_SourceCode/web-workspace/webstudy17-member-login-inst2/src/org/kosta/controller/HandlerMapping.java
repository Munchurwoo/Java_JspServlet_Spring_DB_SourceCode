package org.kosta.controller;
// 컨트롤러 객체 생성을 전담하는 Factory 객체
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.equals("findMemberById")) {
			controller=new FindMemberByIdController();
		}else if(command.equals("findMemberListByAddress")) {
			controller=new FindMemberListByAddressController();
		}else if(command.equals("login")) {
			controller=new LoginController();
		}else if(command.equals("logout")) {
			controller=new LogoutController();
		}else if(command.equals("updateMember")) {
			controller=new UpdateMember();
		}else if(command.equals("register")) {
			controller=new register();
		}else if(command.equals("idCheck")) {
			controller=new idCheck();
		}
		return controller;
	}
}











