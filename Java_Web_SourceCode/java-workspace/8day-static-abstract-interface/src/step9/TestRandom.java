package step9;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		// java.util.Random class 의 nextInt() 테스트 예제
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(5)+1);
		}
		
	}
}
