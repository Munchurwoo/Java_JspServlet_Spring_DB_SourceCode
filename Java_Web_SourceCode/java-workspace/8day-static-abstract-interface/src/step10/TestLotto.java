package step10;

import java.util.TreeSet;

public class TestLotto {
	public static void main(String[] args) {
		LottoService service = new LottoService();
		TreeSet<Integer> set = service.createLottoNumSet();
		System.out.println(set);
		/*
		 * 1~45 ���� �ߺ����� �ʴ� 6���� ���� set�� ��ȯ�Ǿ� ��µȴ�. 
		 */
	}
}
