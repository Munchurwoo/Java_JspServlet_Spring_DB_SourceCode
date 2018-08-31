package test;

import java.util.ArrayList;
import java.util.HashMap;

import model.ProductDAO;

public class TestGroupBy {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			//총 상품수 내림차순으로 제조사와 상품수를 조회 
			ArrayList<HashMap<String,String>> list
							=dao.getMakerAndProductCount();
			for(HashMap<String,String> map:list) {
				System.out.println(map.get("maker")+" "+map.get("totalCount"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	






