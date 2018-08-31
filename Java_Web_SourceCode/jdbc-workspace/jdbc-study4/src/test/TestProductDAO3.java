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
			 * ��ǰ ��ȸ�ÿ� 
			 * ������ percent ��ŭ ������ pirce �� 
			 * ��ǰ ������ �Ҵ��� 
			 * ����Ʈ�� ��� �ǵ��� �Ѵ�. 
			 * price ������������ ���� 
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
