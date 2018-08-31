package test;

import java.sql.SQLException;

import model.ProductDAO;
import model.ProductVO;

public class TestProductDAO {
	public static void main(String[] args) throws SQLException {
		try {
			ProductDAO dao = new ProductDAO();
			ProductVO vo = new ProductVO("°Ö·°½Ã8", "»ï¼º",150); 
			dao.registerProduct(vo);
			System.out.println(vo+"µî·Ï¿Ï·á");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
