package step17;

public class TestFinal {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		service.calculateAnnualSalary(new Employee("������",200));
		/*		������ 2400  
		 */
		service.calculateAnnualSalary(new Manager("���¸�",300,"����"));
		/*   ���¸� 3600
		 */
		service.calculateAnnualSalary(new Engineer("�����",400,"�ڹ�",100));
		/*  ����� 6000	
		 */
	}
}









