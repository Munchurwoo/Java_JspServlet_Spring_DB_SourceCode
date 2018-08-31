package org.kosta.controller;
/*
 *  객체 생성을 전담하는 Factory 객체 
 */
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.equals("GetAllTotalCountController")) {
			controller=new GetAllTotalCountController();
		}else if(command.equals("FindMemberByIdController")) {
			controller=new FindMemberByIdController();
		}else if(command.equals("FindMemberListByAddressController")) {
			controller=new FindMemberListByAddressController();
		}
		return controller;
	}
}














