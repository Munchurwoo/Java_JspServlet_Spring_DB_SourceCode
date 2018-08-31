package step2;

public class TestException5 {
	public static void main(String[] args) {
		int ages[]= {26,30};
		try {
		System.out.println(ages[2]);
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {//Exception 처리 여부와 관계없이 항상 실행 
			System.out.println("finally 영역은 항상 실행");
		}
		System.out.println("프로그램 정상 실행");
	}
}




