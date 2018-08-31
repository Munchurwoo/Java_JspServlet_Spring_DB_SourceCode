package step3;

class MyDate {
	
	private int month = 1;
	
	public MyDate(int month) {
		if (month > 0 && month<13) {
			this.month = month;
		}else {
			System.out.println("잘못된 정보입니다.");
		}
	}

	public int getMonth() {
		return month;
	}
}

public class TestIf2 {
	public static void main(String[] args) {
		int month = 2;
		MyDate date = new MyDate(month);
		System.out.println(date.getMonth());// 2


		int month2 = 13;
		MyDate date2 = new MyDate(month2);// 잘못된 정보입니다.
		System.out.println(date2.getMonth());// 1
	}
}
