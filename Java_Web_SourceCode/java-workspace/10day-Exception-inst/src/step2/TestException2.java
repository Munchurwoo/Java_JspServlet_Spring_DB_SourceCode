package step2;
/*	TestException1 �� ���α׷��� ����������Ǿ��� 
 * TestException2 �� Exception Handling(����ó��) �� ���� 
 * ���α׷� ����� Exception �� �߻��ص� ����帧�� �����ϰ�
 * ���α׷��� ���������� ����ǵ��� ó���ߴ� 
 */
public class TestException2 {
	public static void main(String[] args) {
		String name=null;
		try { //try: Exception �߻� ���� ������ ���� 
			System.out.println(name.length());
		//catch : Exception �߻��� ����帧�� ���� ( ����ó�� ) 	
		}catch(NullPointerException e) {
			System.out.println("����帧����:null�̹Ƿ� ���̸� ���� �� ����");
		}
		System.out.println("���α׷� �������");
	}
}



