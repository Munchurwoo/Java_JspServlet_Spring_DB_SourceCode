package step12;
// Object class의 toString() 메서드를 오버라이딩하는 연습 
public class TestObjectOverride {
	public static void main(String[] args) {
		Employee e=new Employee("1","아이유",300);
		System.out.println(e);// empNo:1  name:아이유	salary:300
		Manager m=new Manager("2","장기하",400,"영업부");
		System.out.println(m);// empNo:2  name:장기하	salary:400 department:영업부
	}
}
