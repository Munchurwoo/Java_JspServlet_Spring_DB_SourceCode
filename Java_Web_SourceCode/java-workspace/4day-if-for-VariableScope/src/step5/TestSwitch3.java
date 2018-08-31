package step5;

class DateService {
	/**
	 * 2�� 28�� 4,6,9,11 ���� 30�� 1,3,5,7,8,10,12���� 31��
	 * 
	 * @param month
	 */
	public void printLastDay(int month) {
		switch (month) {
		case 2:
			System.out.println(month + "�� ������ ���� 28�� �Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "�� ������ ���� 30�� �Դϴ�.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "�� ������ ���� 31�� �Դϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
	}
}

public class TestSwitch3 {
	public static void main(String[] args) {
		DateService service = new DateService();
		int month = 2;
		service.printLastDay(month);// 2���� ������ ���� 28���Դϴ�.
		service.printLastDay(13);// �߸��� �Է°��Դϴ�.
		service.printLastDay(1);// 1���� ������ ���� 31�� �Դϴ�.
		service.printLastDay(4);// 4���� ������ ���� 30�� �Դϴ�.

	}
}
