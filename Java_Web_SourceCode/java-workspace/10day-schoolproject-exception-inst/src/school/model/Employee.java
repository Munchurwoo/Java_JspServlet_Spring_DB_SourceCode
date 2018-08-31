package school.model;

public class Employee extends Person{
	private String department;
	public Employee(String tel, String name, String address, String department) {
		super(tel, name, address);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return super.toString()+" department=" + department;
	}
	
}
