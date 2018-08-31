package org.kosta.controller;
/*	 Simple Factory Pattern 
 *  : 객체 생성을 전담하는 클래스 
 *    사용하는 측(DispatcherServlet) 과 
 *    서비스를 제공하는 측( 개별 컨트롤러) 과의 
 *    결합도를 낮추기 위해 적용한다 
 *    -> 의존관계의 결합도를 낮추어 유지보수성 향상 
 *    
 */
public class HandlerMapping {
	private static  HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.equals("getMemberTotalCount")) {
			controller=new GetMemberTotalCountController();
		}else if(command.equals("findProductById")) {
			controller=new FindProductByIdController();
		}else if(command.equals("registerMember")) {
			controller=new RegisterMemberController();
		}
		return controller;
	}
}
