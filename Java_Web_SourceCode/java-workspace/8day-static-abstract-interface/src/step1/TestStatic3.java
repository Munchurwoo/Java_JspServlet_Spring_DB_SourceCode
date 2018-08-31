package step1;

class Test{
	int count; 
	static int sCount;
}

public class TestStatic3 {
	public void test() {
		System.out.println("안녕");
	}
	public static void main(String[] args) {
		new TestStatic3().test();
		System.out.println(Test.sCount);
		//Test class의 인스턴스 변수 count에 접근하여 출력 
		System.out.println(new Test().count);
	}
}
