package step5;

public class TestSwitch2 {
	public static void main(String[] args) {
		int grade = 1;
		//switch 문은 case 가 실행되면 하위의 모든 case가 수행된다.
		switch (grade) {
		case 1:
			System.out.println("하버드");
			break;
		case 2:
			System.out.println("북경대");
			break;
		case 3:
			System.out.println("동경대");
			break;
		}
	}
}
