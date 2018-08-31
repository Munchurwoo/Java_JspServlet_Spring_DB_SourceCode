package step4;

public abstract class PizzaService {
	protected void prepare() {
		System.out.println("���츦 �����");
	}
	protected abstract void topping();
	protected void bake() {
		System.out.println("����");
	}
	protected void box() {
		System.out.println("�����ϴ�.");
	}
	// Template Method : ���� �θ� Ŭ�������� �۾� ������ ������ Ʋ
	//	 �޼��带 ���� 
	// ���� ����(����) �۾��� ���� �ڽ� Ŭ�������� ���� 
	public void makePizza() {
		prepare();
		topping();
		bake();
		box();
		
	}
}
