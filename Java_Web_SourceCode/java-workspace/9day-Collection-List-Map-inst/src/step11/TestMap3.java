package step11;

import step3.Product;

public class TestMap3 {
	public static void main(String[] args) {
		ProductService service=new ProductService();		
		service.addProduct(new Product("������8","�Ｚ",150));
		service.addProduct(new Product("������7","����",170));
		Product p=service.findProductByName("������7");
		System.out.println(p);//[Product [name=������7, maker=����, price=170]
	}
}








