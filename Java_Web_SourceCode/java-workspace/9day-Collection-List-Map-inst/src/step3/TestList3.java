package step3;

public class TestList3 {
	public static void main(String[] args) {
		CartService service=new CartService();
		service.addProduct(new Product("�����","���",1000));
		service.addProduct(new Product("���̽�","����",1200));
		service.addProduct(new Product("����","�Ｚ",25000));
		service.printAll();// ��ǰ ������ ��µȴ� 
		String name="���̽�";
		Product product=service.findProductByName(name);  
		System.out.println(product);// ��ǰ ������ ��µȴ� , ������ null 
		int totalPrice=service.getTotalPrice();
		System.out.println("��ٱ����� ��ǰ �Ѿ�:"+totalPrice);//27200
	}
}








