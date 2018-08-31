package model;

public abstract class Person {
	//	abstract class 를 선언해서 직접 객체화 되지 않도록 한다. 
	// person 클래스는 자식 클래스를 위해 존재 
	private String tel; // 구성원 식별값 (primary key)
	private String name ;
	private String  address;
	public Person(String tel, String name, String address) {
		super();
		this.tel = tel;
		this.name = name;
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	//java.lang.Object class 의 toString 메서드를 오버라이딩하여 
	// 참조변수를 출력시 주소값 대신 실제 객체 속성 정보를 출력하도록 정의 
	@Override
	public String toString() {
		return "tel=" + tel + ", name=" + name + ", address=" + address + ",";
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
