package model;

public class Emp {
	private int empNo;
	private String name;
	private int salary;
	// ����� �μ��� has a �Ѵ�. 
	private Department department;
	public Emp(int empNo, String name, int salary, Department department) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public Emp(int i, String string, String string2, int j, Department department2) {
		super();
		
	}
	public Emp() {
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}