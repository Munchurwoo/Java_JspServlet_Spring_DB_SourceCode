package step2;

public class TestException5 {
	public static void main(String[] args) {
		int ages[]= {26,30};
		try {
		System.out.println(ages[2]);
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {//Exception ó�� ���ο� ������� �׻� ���� 
			System.out.println("finally ������ �׻� ����");
		}
		System.out.println("���α׷� ���� ����");
	}
}




