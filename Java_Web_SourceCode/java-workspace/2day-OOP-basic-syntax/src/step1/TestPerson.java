package step1;
/*
 * Person class�� test �ϴ� Ŭ���� 
 * : Person class�� �̿��� Person Object(��ü)�� �����ϰ�, Person class�� ���� ������ 
 * �����͸� �Ҵ��ϴ� �׽�Ʈ �� ������ ����� �����͸� ����غ��� ���� 
 */
public class TestPerson {
	public static void main(String[] args) {
		//Person class�� �̿��� ��üobject�� ���� 
		/*
		 * p : ��ü�� �����ϴ� ���� 
		 * 
		 */
		Person p = new Person();
		Person p2 = new Person();
		// �� ������ jvm�� ���� ����Ǹ� Person ��ü�� �޸𸮿� ����ȴ�. 
		// p ��ü�� ���� ������ �����͸� �Ҵ� 
		p.name = "�����";
		p.age=24; 
		// p ��ü�� ����� name �� age�� ����غ���. 
		System.out.println("�̸�:"+p.name);
		System.out.println("����:"+p.age);
		//eat() �޼��� ȣ�� 
		p.eat();
		p.sleep(9);
		System.out.println(p.getDetailInfo());
		/*
		 *  p2 ���������� Person ��ü�� �����غ���.
		 */
		p2.name="������";
		p2.age=26;
		/*
		 * p2 ��ü�� name �� ������, age �� 26�� �����Ѵ�. 
		 */
		System.out.println("�̸�:"+p2.name);
		System.out.println("�̸�:"+p2.age);
		p2.eat();
		p2.sleep(6);
		p2.study("�ڹ�", 6);
		System.out.println(p2.getDetailInfo());
		/*
		 * ����� p2 ��ü�� name�� age �� ����غ���. 
		 */
	}
}
