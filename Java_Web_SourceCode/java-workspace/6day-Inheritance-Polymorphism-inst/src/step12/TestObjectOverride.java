package step12;
// Object class�� toString() �޼��带 �������̵��ϴ� ���� 
public class TestObjectOverride {
	public static void main(String[] args) {
		Employee e=new Employee("1","������",300);
		System.out.println(e);// empNo:1  name:������	salary:300
		Manager m=new Manager("2","�����",400,"������");
		System.out.println(m);// empNo:2  name:�����	salary:400 department:������
	}
}
