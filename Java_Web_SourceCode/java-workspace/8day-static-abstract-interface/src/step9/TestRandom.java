package step9;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		// java.util.Random class �� nextInt() �׽�Ʈ ����
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(5)+1);
		}
		
	}
}
