package step5;

import step4.Person;

public class TestRefArray3 {
	public static void main(String[] args) {
		Person p[] = { new Person("�ں���", 22), new Person("������", 26), 
				new Person("�����", 24),new Person("��ȿ��",40) };
		PersonService service = new PersonService();
		//p �迭 ����� age�� ���� ���� age�� ����ϴ� �޼��带 ȣ�� 
		service.printMaxAge(p);
		
		/*
		 *  �Ʒ� �޼��带 ȣ���ϸ� p�迭 ����� ���� ���� ������ ��� ��ü�� ��ȯ���ش�. 
		 */
		Person person=service.getPersonByMinAge(p);
		// �ں��� 22�� ��µȴ�. 
		System.out.println(person.getName()+" " + person.getAge());
		
	}
}
