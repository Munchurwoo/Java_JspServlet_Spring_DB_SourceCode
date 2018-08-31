package step1;

public class TestStatic2 {
	int a;
	static int b;
	public void c() {}
	public static void d() {}
	public static void main(String[] args) {
		//a, b, c, d 중에 바로 접근 가능한 대상은 ?
		System.out.println(b);
		//클래스 로딩시 메모리에 적재되므로 객체생성없이 바로 사용 가능 
	}
}
