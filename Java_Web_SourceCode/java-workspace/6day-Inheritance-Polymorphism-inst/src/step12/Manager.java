package step12;

public class Manager extends Employee{
	private String department;
	public Manager(String empNo,String name,int salary,String department) {
		super(empNo,name,salary);
		this.department=department;
	}
	public String toString() {//Employee class�� toString()�� �������̵�
		return super.toString()+" department:"+department;
	}
}
