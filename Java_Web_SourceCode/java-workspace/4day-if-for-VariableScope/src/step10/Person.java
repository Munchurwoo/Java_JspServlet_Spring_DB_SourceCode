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
		//RentCar�� �Ͻ������� ��� �� �ʿ䰡 �����Ƿ� 
		//���������� ó���Ѵ�. 
		RentCar car = new RentCar("�ҳ�Ÿ","����");
		System.out.println(name+"�� " +car.getColor()+car.getModel()+"��Ʈī�� �����ϴ�.");
		
	}
}
