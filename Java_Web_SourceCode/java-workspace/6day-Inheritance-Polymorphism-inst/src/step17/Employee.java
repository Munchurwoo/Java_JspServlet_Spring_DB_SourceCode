package step17;

public class Employee {//extends Object
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		super(); // Object ������ ȣ���ؼ� ��ü ���� 
		this.name = name;
		this.salary = salary;
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
	
}
