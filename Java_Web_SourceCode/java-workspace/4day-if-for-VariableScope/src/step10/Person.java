package step10;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void tour() {
		//RentCar는 일시적으로 사용 후 필요가 없으므로 
		//지역변수로 처리한다. 
		RentCar car = new RentCar("소나타","검정");
		System.out.println(name+"가 " +car.getColor()+car.getModel()+"렌트카로 여행하다.");
		
	}
}
