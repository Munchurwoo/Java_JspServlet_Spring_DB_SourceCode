package step12;

public class Employee {//extends Object : �θ� Ŭ���� ��õǾ� ���� ������ �ڵ� ���� 
	private String empNo;
	private String name;
	private int salary;
	public Employee(String empNo,String name,int salary) {
		this.empNo=empNo;
		this.name=name;
		this.salary=salary;
	}
	// �θ� Ŭ������ �޼��� toString()�� �������̵��Ͽ� �ڽſ� �°� �ٽ� �����Ѵ� 
	public String toString() {
		return "empNo:"+empNo+" name:"+name+" salary:"+salary;
	}
}














