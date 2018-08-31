package step11;

import step3.Product;

public class TestMap3 {
	public static void main(String[] args) {
		ProductService service=new ProductService();		
		service.addProduct(new Product("갤럭시8","삼성",150));
		service.addProduct(new Product("아이폰7","애플",170));
		Product p=service.findProductByName("아이폰7");
		System.out.println(p);//[Product [name=아이폰7, maker=애플, price=170]
	}
}








