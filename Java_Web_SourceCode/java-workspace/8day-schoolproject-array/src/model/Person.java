package model;

public abstract class Person {
	//	abstract class �� �����ؼ� ���� ��üȭ ���� �ʵ��� �Ѵ�. 
	// person Ŭ������ �ڽ� Ŭ������ ���� ���� 
	private String tel; // ������ �ĺ��� (primary key)
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
	//java.lang.Object class �� toString �޼��带 �������̵��Ͽ� 
	// ���������� ��½� �ּҰ� ��� ���� ��ü �Ӽ� ������ ����ϵ��� ���� 
	@Override
	public String toString() {
		return "tel=" + tel + ", name=" + name + ", address=" + address + ",";
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
