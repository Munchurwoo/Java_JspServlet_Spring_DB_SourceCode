package step1;

public class TestStatic4 {
	public static void main(String[] args) {
		String s1 = "2";
		String s2="8";
		System.out.println(s1+s2);
		//���������� ��ȯ�ϱ� ���� java.lang.Integer Ŭ������ 
		//static method �� parseInt() �� Ȱ���Ѵ�.
		
		int i = Integer.parseInt(s1);//static �̹Ƿ� ��ü �������� Ŭ������.�ɹ� 
		int j = Integer.parseInt(s2);//static �̹Ƿ� ��ü �������� Ŭ������.�ɹ� 
		System.out.println(i+j);
	}
}
