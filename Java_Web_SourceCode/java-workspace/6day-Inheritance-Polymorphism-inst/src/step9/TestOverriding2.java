package step9;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee employee=new Employee("1","아이유",300);
		System.out.println(employee.getDetails());
		//위 코드가 실행되면 아래와 같이 출력된다 
		// empNo:1    name:아이유	salary:300
		Manager manager=new Manager("2","김태리",400,"영업부");
		System.out.println(manager.getDetails());
		//위 코드가 실행되면 아래와 같이 출력된다 
		// empNo:2    name:김태리	salary:400 department:영업부 
		Engineer engineer=new Engineer("3","손흥민",500,"자바");
		System.out.println(engineer.getDetails());
		// empNo:3	  name:손흥민 	salary:500	skill:자바 
	}
}













