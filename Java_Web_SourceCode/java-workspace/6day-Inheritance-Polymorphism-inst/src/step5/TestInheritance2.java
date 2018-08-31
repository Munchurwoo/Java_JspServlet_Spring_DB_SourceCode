package step5;

public class TestInheritance2 {
	public static void main(String[] args) {
		Employee e=new Employee("1","아이유",300);
		System.out.println(e.getEmpNo());//1
		System.out.println(e.getName());//아이유 
		System.out.println(e.getSalary());//300
		Manager m=new Manager("2","김태리",400,"영업부");
		System.out.println(m.getEmpNo());//2
		System.out.println(m.getName());//김태리
		System.out.println(m.getSalary());//400
		System.out.println(m.getDepartment());//영업부
		Engineer en=new Engineer("3","고슬링",500,"자바");
		System.out.println(en.getEmpNo());//3
		System.out.println(en.getName());//고슬링
		System.out.println(en.getSalary());//500
		System.out.println(en.getSkill());//자바
	}
}













