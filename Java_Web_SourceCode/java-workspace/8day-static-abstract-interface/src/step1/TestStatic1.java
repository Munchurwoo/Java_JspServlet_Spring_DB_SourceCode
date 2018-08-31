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
		//static 과 static method 끼리는 아래와 같이 바로 접근해 호출가능 
	}
}
