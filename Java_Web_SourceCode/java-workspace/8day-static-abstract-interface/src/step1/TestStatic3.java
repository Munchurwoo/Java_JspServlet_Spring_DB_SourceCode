package step1;

class Test{
	int count; 
	static int sCount;
}

public class TestStatic3 {
	public void test() {
		System.out.println("�ȳ�");
	}
	public static void main(String[] args) {
		new TestStatic3().test();
		System.out.println(Test.sCount);
		//Test class�� �ν��Ͻ� ���� count�� �����Ͽ� ��� 
		System.out.println(new Test().count);
	}
}
