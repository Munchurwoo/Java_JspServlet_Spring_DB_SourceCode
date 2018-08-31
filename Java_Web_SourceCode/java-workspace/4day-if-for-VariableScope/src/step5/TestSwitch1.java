package step5;

public class TestSwitch1 {
	public static void main(String[] args) {
		int grade = 4;
		//switch 문은 case 가 실행되면 하위의 모든 case가 수행된다.
		//해당 case만 실행되고 종료하고자 한다면 break 키워드를 명시해야 한다. 
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
		default :
			System.out.println("서울대");
		}
	}
}
