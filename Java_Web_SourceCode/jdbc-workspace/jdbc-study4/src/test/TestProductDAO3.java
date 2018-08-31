package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ProductDAO;
import model.ProductVO;

public class TestProductDAO3 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			/*
			 * 상품 조회시에 
			 * 전달한 percent 만큼 할인한 pirce 로 
			 * 상품 정보를 할당해 
			 * 리스트로 출력 되도록 한다. 
			 * price 내리차순으로 정렬 
			 */
			int percent = 10;
			
			ArrayList<ProductVO> list = dao.getProductListDiscountPrice(percent);
			for(ProductVO vo : list)
				System.out.println(vo.getId()+" " + vo.getMaker()+ " " + vo.getPrice()+" " + vo.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
