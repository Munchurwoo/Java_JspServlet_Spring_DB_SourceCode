package step2;
/*
 * 조건문
 */
public class TestIf1 {
	public static void main(String[] args) {
		int age =18;
		if(age>19) {
			System.out.println(age+"세 노인");
		}else if(age>13) {
			System.out.println("세 청소년");
		}else {
			System.out.println(age+"세 어린이");
		}
	}
}
