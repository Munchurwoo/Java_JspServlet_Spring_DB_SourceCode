package model;

public class Emp {
	private String empNo;
	private String name;
	private int salary;
	// 사원은 부서를 has a 한다 
	private Department department;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String empNo, String name, int salary, Department department) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
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
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
}
