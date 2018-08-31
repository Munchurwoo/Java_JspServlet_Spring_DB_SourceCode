package step7;

public class TestReferenceVariable {
	public static void main(String[] args) {
		RegDate date = new RegDate(2018,7,11);
		date.setMonth(11);
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDay());
	}
}
