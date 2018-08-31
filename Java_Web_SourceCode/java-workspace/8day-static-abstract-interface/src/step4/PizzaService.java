package step4;

public abstract class PizzaService {
	protected void prepare() {
		System.out.println("도우를 만들다");
	}
	protected abstract void topping();
	protected void bake() {
		System.out.println("굽다");
	}
	protected void box() {
		System.out.println("포장하다.");
	}
	// Template Method : 상위 부모 클래스에서 작업 공정을 정의한 틀
	//	 메서드를 제공 
	// 상세한 구현(토핑) 작업은 하위 자식 클래스에서 구현 
	public void makePizza() {
		prepare();
		topping();
		bake();
		box();
		
	}
}
