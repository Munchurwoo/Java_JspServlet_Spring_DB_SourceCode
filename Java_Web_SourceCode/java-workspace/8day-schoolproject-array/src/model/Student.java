package model;

public class Student extends Person {
	private String stuId;

	public Student(String tel, String name, String address, String stuId) {
		super(tel, name, address);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		// Person의 toString()을 재사용한다.
		return super.toString()+"stuId="+stuId;
	}
	
	
}
