package test;

import java.util.ArrayList;

import model.ProductDAO;

public class TestProductDAO4 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			//maker종류출력 
			ArrayList<String> list=dao.getMakerKind();
			for(String maker:list)
				System.out.println(maker);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}












