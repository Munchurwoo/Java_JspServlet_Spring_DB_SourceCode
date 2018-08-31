package org.kosta.model;

public class CustomerVO {
	private String id;
	private String password;
	private String name;
	private String address;
	private String birthday;
	private String regdate;
	private String age;
	public CustomerVO() {
		super();		
	}
	
	public CustomerVO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CustomerVO(String id, String password, String name, String address, String birthday) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}

	//필요시 생성자 오버로딩해서 사용한다 
	public CustomerVO(String id, String password, String name, String address, String birthday, String regdate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
		this.regdate = regdate;
	}
	
	public CustomerVO(String id, String password, String name, String address, String birthday, String regdate,
			String age) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
		this.regdate = regdate;
		this.age = age;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address
				+ ", birthday=" + birthday + ", regdate=" + regdate + "]";
	}
	
}
