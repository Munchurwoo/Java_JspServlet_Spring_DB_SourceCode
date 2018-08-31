package step1;

public class Car {
	private String model;
	private Engine engine;
	/*
	 *  Car �� Engine�� composition �����̹Ƿ� 
	 *  life cycle �����ֱ⸦ �Բ� �ϱ� ���� 
	 *  Car ���� �� �ݵ�� Engine�� ������ �� 
	 *  Car ��ü�� �����ǵ��� ó���Ѵ�. 
	 */
	public Car(String model){
		this.model=model;
		this.engine=new Engine("L4","2000");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
