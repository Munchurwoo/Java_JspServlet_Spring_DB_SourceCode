package step4;

public class TestRefArray2 {
	public static void main(String[] args) {

		Person p[] = { new Person("�ں���", 22), new Person("������", 26), new Person("�����", 24) };
		// p �迭 ��� �� ���̰� 25�� ������ ����� name�� age�� ����Ѵ�.
		for (int i = 0; i < p.length; i++) {
			if (p[i].getAge() <= 25) {
				System.out.println(p[i].getAge() + " " + p[i].getName());
			}
		}
		System.out.println("****************");
		// �迭 ����� age�� 10�� ���ϱ� 
		for (int i = 0; i < p.length; i++) {
			System.out.println((p[i].getAge()+10) + " " + p[i].getName());
		}
		
		for (int i = 0; i < p.length; i++) {
			p[i].setAge(p[i].getAge()+10);
			System.out.println(p[i].getAge() + " " + p[i].getName());
		}
		
	}
}