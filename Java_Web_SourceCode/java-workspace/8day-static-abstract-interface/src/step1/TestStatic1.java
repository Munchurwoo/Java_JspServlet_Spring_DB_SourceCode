package step1;

public class TestStatic1 {
	public void a() {
		b();
	}
	public static void c() {}
	public void b() {}
	public static void main(String[] args) {
		TestStatic1 t = new TestStatic1();
		t.a();
		c();
		//static �� static method ������ �Ʒ��� ���� �ٷ� ������ ȣ�Ⱑ�� 
	}
}
