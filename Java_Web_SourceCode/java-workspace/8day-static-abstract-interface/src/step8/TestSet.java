package step8;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Set Interface �� implements �ϴ� Ŭ������ ����ϴ� ���� 
 */
public class TestSet {
	public static void main(String[] args) {
		// <String> : Generic ����� Ÿ���� ��� -> ������ ������ 
		Set<String> set1 = new LinkedHashSet<String>();
		set1.add("������");
		set1.add("�ں���");
		set1.add("������"); // �ߺ��ǹǷ� add ���� �ʴ´�. Set �迭�� �ߺ� x 
		System.out.println(set1.size());
		set1.add("����");
		//�߰��� ������� ����ȴ�. LinkedHashSet �� Ư¡ 
		System.out.println(set1.toString());
		System.out.println(set1); // ���������� toString() ȣ���ϹǷ� ���� ��� ����. 
	}
}
