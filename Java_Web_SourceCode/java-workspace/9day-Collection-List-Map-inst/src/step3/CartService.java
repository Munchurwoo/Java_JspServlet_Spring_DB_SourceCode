package step3;

import java.util.ArrayList;

public class CartService {
	private ArrayList<Product> list=new ArrayList<Product>();
	public void addProduct(Product product) {
		list.add(product);
	}
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	public Product findProductByName(String name) {
		Product product=null;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				product=list.get(i);
				break;
			}
		}
		return product;
	}
	public int getTotalPrice() {
		int totalPrice=0;
		for(int i=0;i<list.size();i++)
			totalPrice+=list.get(i).getPrice();
		return totalPrice;
	}
}















