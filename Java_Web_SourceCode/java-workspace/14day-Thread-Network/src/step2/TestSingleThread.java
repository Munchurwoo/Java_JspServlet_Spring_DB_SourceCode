package step2;
/*
 * 단일 스레드 환경에서는 테스트 
 * 아래 코드 실행시 아무런 문제가 없다.
 */
class Toilt{
	private boolean seat; // 인스턴스변수이므로 기본 초기화 false
	public void use(String user) throws InterruptedException {
		if(seat==false) {
			System.out.println(user+"님 입장");
			Thread.sleep(10);
			seat=true;
			System.out.println(user+"님 사용중");
			Thread.sleep(1000);
			System.out.println(user+"님 나옴");
			seat=false;
		}else {
			System.out.println(user+"님 화장실 사용중이므로 입장 못합니다.");
		}
	}
}
public class TestSingleThread {
	public static void main(String[] args) {
		Toilt t= new Toilt();
		try {
			t.use("신현수");
			t.use("최요셉");
			t.use("문준위");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
