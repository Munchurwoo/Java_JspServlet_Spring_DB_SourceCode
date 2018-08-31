package step11;

import java.util.LinkedHashMap;

import step3.Product;

public class ProductService {
	private LinkedHashMap<String,Product> map
								=new LinkedHashMap<String,Product>();
	public void addProduct(Product product) {
		map.put(product.getName(), product);//key 와 value 형식으로 저장 
	}
	public Product findProductByName(String name) {	
		return map.get(name); // key로 검색해서 리턴 
	}
}










