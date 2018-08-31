package step12;

public class Employee {//extends Object : 부모 클래스 명시되어 있지 않으면 자동 삽입 
	private String empNo;
	private String name;
	private int salary;
	public Employee(String empNo,String name,int salary) {
		this.empNo=empNo;
		this.name=name;
		this.salary=salary;
	}
	// 부모 클래스의 메서드 toString()을 오버라이딩하여 자신에 맞게 다시 정의한다 
	public String toString() {
		return "empNo:"+empNo+" name:"+name+" salary:"+salary;
	}
}














