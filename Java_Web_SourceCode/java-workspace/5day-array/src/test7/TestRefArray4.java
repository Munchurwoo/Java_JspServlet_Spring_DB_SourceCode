package test7;

public class TestRefArray4 {
	public static void main(String[] args) {
		Employee e[] = new Employee[3];
		e[0] = new Employee("������", "�Ǳ�", 400);
		e[1] = new Employee("�ں���","����",300);
		e[2] =new Employee("�ֿ��","�Ǳ�",600);
		EmployeeService service=new EmployeeService();
		String address="�Ǳ�";
		service.printEmployeeInfoByAddress(e,address);
		/*
		 * ������ �Ǳ� 400 
		 * �ֿ�� �Ǳ� 600 
		 */
		int salary=500;
		// address �� ��ġ�ϰ� salary �̻��� �޴� ����� ��� 
		service.printEmployeeInfoByAddressAndSalary(e, address,salary);
		// �ֿ�� �Ǳ� 600
	}
}
