package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import model.ProductDAO;

public class TestGroupBY {
	public static void main(String[] args) {
		try {
			
			ProductDAO dao = new ProductDAO();
			//�� ��ǰ�� ������������ ������� ��ǰ���� ��ȸ 
			ArrayList<HashMap<String,String>> list = dao.getMakerAndProductCount();
			for(HashMap<String, String> map : list)
//				System.out.println(list.get(0));
				System.out.println(map.get("maker")+ " " + map.get("total"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
