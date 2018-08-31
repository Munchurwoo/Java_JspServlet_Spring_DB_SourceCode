package test;

import java.util.ArrayList;

import model.ProductDAO;
import model.ProductVO;

public class TestProductDAO3 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			int highPrice=200;
			int lowPrice=130; // 130 이상 200 이하 상품 조회( 가격내림차순 ) 
			ArrayList<ProductVO> list=dao.getProductListByPrice(highPrice,lowPrice);
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}














