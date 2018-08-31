package model;
/**
 * DAO : Data Access Object 
 * @author kosta-inst
 * 편의상 직접 database 연동은 하지 않는다 
 */
public class CarDAO {
	private static CarDAO dao=new CarDAO();
	private CarDAO(){}
	public static CarDAO getInstance(){
		return dao;
	}	
	public CarDTO getCarInfo(String maker){
		CarDTO car=null;
		if(maker.equals("현대")){
			car=new CarDTO("소나타",250);
		}else if(maker.equals("기아")){
			car=new CarDTO("K5",300);
		}else if(maker.equals("삼성")){
			car=new CarDTO("QM5",350);
		} 
		return car;
	}
}










