package step5;

class DateService {
	/**
	 * 2월 28일 4,6,9,11 월은 30일 1,3,5,7,8,10,12월은 31일
	 * 
	 * @param month
	 */
	public void printLastDay(int month) {
		switch (month) {
		case 2:
			System.out.println(month + "의 마지막 일은 28일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "의 마지막 일은 30일 입니다.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "의 마지막 일은 31일 입니다.");
			break;
		default:
			System.out.println("잘못되 입력값입니다.");
		}
	}
}

public class TestSwitch3 {
	public static void main(String[] args) {
		DateService service = new DateService();
		int month = 2;
		service.printLastDay(month);// 2월의 마지막 일은 28일입니다.
		service.printLastDay(13);// 잘못된 입력값입니다.
		service.printLastDay(1);// 1월의 마지막 날은 31일 입니다.
		service.printLastDay(4);// 4월의 마지막 날은 30일 입니다.

	}
}
