package step17;

public class Manager extends Employee{
	private String department;
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
