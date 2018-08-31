package test;

import model.ProductDAO;
import model.ProductVO;

public class TestProductDAO {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			ProductVO vo=dao.findProductById("a");
			System.out.println(vo);
			System.out.println(vo.getId()+" "+vo.getName()+" "+vo.getMaker()+" "+vo.getPrice()); 
			//없으면 null , 있으면 product 정보출력 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}








