package step9;

public class Manager extends Employee{
	private String department;
	public Manager(String empNo,String name,int salary,String department) {
		super(empNo,name,salary);
		this.department=department;
	}
	//method overriding : 부모의 getDetails 메서드는 department를 반환하는
	//역할이 없으므로 메서드 오버라이딩하여 department를 반환하게 한다 
	public String getDetails() {
		return super.getDetails()+" department:"+department;
	}
}







