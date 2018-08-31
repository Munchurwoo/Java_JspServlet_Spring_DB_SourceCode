package step5;

public class Engineer extends Employee{
	private String skill;
	public Engineer(String empNo,String name,int salary,String skill) {
		super(empNo,name,salary);
		this.skill=skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}
