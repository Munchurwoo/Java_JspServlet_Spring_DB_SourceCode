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
			 * �ֱٿ� ��ϵ� ��ǰ������ ( ��ǰ ���̵� �������� ) 
			 * ��ǰ ����� ��ȸ�� ����Ѵ�. 
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
