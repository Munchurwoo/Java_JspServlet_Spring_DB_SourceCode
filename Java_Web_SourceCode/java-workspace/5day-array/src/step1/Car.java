package step1;

public class Car {
	private String model;
	private Engine engine;
	/*
	 *  Car 와 Engine은 composition 관계이므로 
	 *  life cycle 생명주기를 함께 하기 위해 
	 *  Car 생성 전 반드시 Engine을 생성한 후 
	 *  Car 객체가 생성되도록 처리한다. 
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
