package test;

import java.sql.SQLException;

import model.ProductDAO;

public class TestProductCount {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			int totalCount=dao.getProductTotalCount();//3
			System.out.println("ÃÑ»óÇ°¼ö : "+totalCount);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
