package step3;

public class TestList3 {
	public static void main(String[] args) {
		CartService service=new CartService();
		service.addProduct(new Product("새우깡","농심",1000));
		service.addProduct(new Product("참이슬","진로",1200));
		service.addProduct(new Product("족발","삼성",25000));
		service.printAll();// 상품 정보가 출력된다 
		String name="참이슬";
		Product product=service.findProductByName(name);  
		System.out.println(product);// 상품 정보가 출력된다 , 없으면 null 
		int totalPrice=service.getTotalPrice();
		System.out.println("장바구니의 상품 총액:"+totalPrice);//27200
	}
}








