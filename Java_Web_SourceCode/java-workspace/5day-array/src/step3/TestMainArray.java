package step3;

public class TestMainArray {
	// main method에서 제공하는 String 배열을 활용 
	// 아래 String [] args 배열은 실행시에 명시하는 
	// 문자열 ( ex - java step3.TestMainArray 아이유 박보검 )
	// 로 할당된다. 
	public static void main(String[] args) {
		for(int i = 0;i< args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
