package step9;

public class Manager extends Employee{
	private String department;
	public Manager(String empNo,String name,int salary,String department) {
		super(empNo,name,salary);
		this.department=department;
	}
	//method overriding : �θ��� getDetails �޼���� department�� ��ȯ�ϴ�
	//������ �����Ƿ� �޼��� �������̵��Ͽ� department�� ��ȯ�ϰ� �Ѵ� 
	public String getDetails() {
		return super.getDetails()+" department:"+department;
	}
}







