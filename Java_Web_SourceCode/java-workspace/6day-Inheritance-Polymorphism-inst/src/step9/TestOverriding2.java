package step9;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee employee=new Employee("1","������",300);
		System.out.println(employee.getDetails());
		//�� �ڵ尡 ����Ǹ� �Ʒ��� ���� ��µȴ� 
		// empNo:1    name:������	salary:300
		Manager manager=new Manager("2","���¸�",400,"������");
		System.out.println(manager.getDetails());
		//�� �ڵ尡 ����Ǹ� �Ʒ��� ���� ��µȴ� 
		// empNo:2    name:���¸�	salary:400 department:������ 
		Engineer engineer=new Engineer("3","�����",500,"�ڹ�");
		System.out.println(engineer.getDetails());
		// empNo:3	  name:����� 	salary:500	skill:�ڹ� 
	}
}













