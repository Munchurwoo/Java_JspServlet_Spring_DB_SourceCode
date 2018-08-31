package step10;

import java.util.TreeSet;

public class TestLotto {
	public static void main(String[] args) {
		LottoService service = new LottoService();
		TreeSet<Integer> set = service.createLottoNumSet();
		System.out.println(set);
		/*
		 * 1~45 사이 중복되지 않는 6개의 정수 set이 반환되어 출력된다. 
		 */
	}
}
