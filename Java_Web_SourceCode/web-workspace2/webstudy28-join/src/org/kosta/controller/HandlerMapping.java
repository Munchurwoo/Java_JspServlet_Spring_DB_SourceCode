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
		if(command.equals("EmployeeList")) {
			controller = new EmployeeListController();
		}else if(command.equals("RegisterEmployeeForm")) {
			controller = new RegisterEmployeeFormController(); 
		}else if(command.equals("RegisterEmployee")) {
			controller = new RegisterEmployeeController();
		}
		return controller;
	}
}






















