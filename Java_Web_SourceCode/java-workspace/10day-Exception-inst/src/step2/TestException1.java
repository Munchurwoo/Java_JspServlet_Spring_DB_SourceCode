package step2;

public class TestException1 {
	public static void main(String[] args) {
		String name="������";
		System.out.println(name.length());
		name=null;
		//JVM�� �����ϴٰ� name�� null �� length() �� ȣ���ϴ� �ڵ带
		// �����ϴ� ������ 
		// java.lang.NullPointerException �� �߻���Ű�� 
		// ���α׷��� �ߴ��Ѵ� (������ ����)
		System.out.println(name.length());
		System.out.println("���α׷� ���� ����");
	}
}





