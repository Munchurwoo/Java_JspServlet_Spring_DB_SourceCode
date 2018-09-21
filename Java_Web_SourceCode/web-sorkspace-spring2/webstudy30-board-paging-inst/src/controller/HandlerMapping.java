package controller;

public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return instance;
	}
	public Controller create(String command){
		Controller c=null;
		if(command.equals("Login")){
			c=new LoginController();
		}else if(command.equals("Logout")){
			c=new LogoutController();
		}else if(command.equals("List")){
			c=new ListController();
		}else if (command.equals("WritePostForm")) {
			c = new WritePostFormController();
		}else if (command.equals("WritePost")) {
			c = new WritePostController();
		}else if(command.equals("PostDetailNoHits")){
				c=new PostDetailNoHitsController();
		} else if (command.equals("PostDetail")) {
			c = new PostDetailController();
		}else if(command.equals("DeletePost")){
			c=new DeletePostController();
		}else if(command.equals("UpdatePostForm")){
			c=new UpdatePostFormController();
		}else if(command.equals("UpdatePost")){
			c=new UpdatePostController();
		}
		return c;
	}
}










