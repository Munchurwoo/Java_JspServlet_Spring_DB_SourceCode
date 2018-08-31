package step9;

public class Engineer extends Employee{
	private String skill;
	public Engineer(String empNo,String name,int salary,String skill) {
		super(empNo,name,salary);
		this.skill=skill;
	}	
	//메서드 오버라이딩 
	public String getDetails() {		
		return super.getDetails()+" skill:"+skill;
	}	
}




