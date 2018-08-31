package controller;

public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return instance;
	}
	public Controller create(String command){		
		Controller c=null;
		if(command.equals("Upload")){
			c=new UploadController();
		}else if(command.equals("DetailProduct")) {
			c=new DetailProductController();
		}
		return c;
	}
}










