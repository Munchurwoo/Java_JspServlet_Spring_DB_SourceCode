package step5;

public class TestSwitch1 {
	public static void main(String[] args) {
		int grade = 4;
		//switch ���� case �� ����Ǹ� ������ ��� case�� ����ȴ�.
		//�ش� case�� ����ǰ� �����ϰ��� �Ѵٸ� break Ű���带 ����ؾ� �Ѵ�. 
		switch (grade) {
		case 1:
			System.out.println("�Ϲ���");
			break;
		case 2:
			System.out.println("�ϰ��");
			break;
		case 3:
			System.out.println("�����");
			break;
		default :
			System.out.println("�����");
		}
	}
}
