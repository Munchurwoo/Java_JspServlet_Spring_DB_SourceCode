package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ProductDAO;
import model.ProductVO;

public class TestProductDAO2 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			/*
			 * 최근에 등록된 상품순으로 ( 상품 아이디 내림차순 ) 
			 * 상품 목록을 조회해 출력한다. 
			 */
			ArrayList<ProductVO> list = dao.getAllProductList();
			for(ProductVO vo : list)
				System.out.println(vo);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
