package org.kosta.controller;

import javax.servlet.http.HttpSession;

//Controller 객체 생성을 전담하는 Factory 객체 

public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller = null;
		if(command.equals("findMemberById")) {
			controller=new findMemberById();
		}else if(command.equals("FindMemberListByAddressController")){
			controller=new FindMemberListByAddressController();
		}else if(command.equals("loginCheck")) {
			controller = new loginCheck();
		}
		return controller;
	}
}
