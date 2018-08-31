package test;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

/**
 * SchoolService�� ���񽺸� �׽�Ʈ�ϴ� Ŭ����
 * 
 * @author KOSTA16
 *
 */
public class TestSchool {
	public static void main(String[] args) {
		int length = 10;// �� ������ 10������ �Ҵ�
		SchoolService service = new SchoolService(length);
		service.addPerson(new Student("0101231234", "������", "ȭ��", "17"));
		service.addPerson(new Teacher("0101231235", "��ȿ��", "����", "�ڹ�"));
		service.addPerson(new Student("0101231236", "�̻��", "����", "16"));
		service.addPerson(new Employee("0101231237", "����", "��õ", "�繫��"));
		service.addPerson(new Student("0101231238", "������", "���", "18"));
		service.addPerson(new Teacher("0101231239", "����", "���", "����"));
		// �Ʒ� ������ �׽�Ʈ�� �ڵ�
		// service.addPerson(new Person("070","Ʈ����","������"));

		// �ߺ��׽�Ʈ �� ���� �ʰ� �׽�Ʈ
	//	service.addPerson(new Student("0101231238", "������", "���", "18"));
		System.out.println("***�б� ������ ��� �Ϸ�***");
		service.printAll();// 6�� ���
	/*	System.out.println("***��ü ������ ��� �Ϸ�***");
		String tel = "0101231238";
		Person p = service.findPersonByTel(tel);
		System.out.println("�˻����:" + p);
		// tel�� �ش��ϴ� �������� ������ ����ϰ� ������ null�� ��µ�
		System.out.println("***�˻��Ϸ�***");
		System.out.println("���� �� ����:" + service.findPersonByTel("0101231237"));
		service.updatePerson(new Employee("0101231237", "�ں���", "����", "�����"));
		System.out.println("���� �� ����:" + service.findPersonByTel("0101231237"));
		System.out.println("**���� �׽�Ʈ �Ϸ�**");
		System.out.println("**���� �� ���**");
		service.printAll();// 6�� ���
		service.deletePerson("0101231239");
		System.out.println("**���� �� ���**");
		service.printAll();// 5�� ���
*/	}
}