package step5;

public class TestInheritance2 {
	public static void main(String[] args) {
		Employee e=new Employee("1","������",300);
		System.out.println(e.getEmpNo());//1
		System.out.println(e.getName());//������ 
		System.out.println(e.getSalary());//300
		Manager m=new Manager("2","���¸�",400,"������");
		System.out.println(m.getEmpNo());//2
		System.out.println(m.getName());//���¸�
		System.out.println(m.getSalary());//400
		System.out.println(m.getDepartment());//������
		Engineer en=new Engineer("3","����",500,"�ڹ�");
		System.out.println(en.getEmpNo());//3
		System.out.println(en.getName());//����
		System.out.println(en.getSalary());//500
		System.out.println(en.getSkill());//�ڹ�
	}
}













