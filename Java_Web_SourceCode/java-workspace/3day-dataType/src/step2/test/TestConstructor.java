package step2.test;

import step2.model.CreditCard;

/*
 * ������ ( Constructor ) �� �����ϰ� �׽�Ʈ�ϴ� ���� 
 */
public class TestConstructor {
	public static void main(String[] args) {
		/*
		 * CreditCard : Ŭ���������� ������Ÿ�� 
		 * c : ���� , ��������, ��ü�� �����ϴ� ���� 
		 * = : �Ҵ� assign 
		 * new : ��ü ������ ����ϴ� Ű���� 
		 * CreaditCard() : ������ Constructor
		 */
		//CreditCard Ŭ������ �Ű������� ��õ� �����ڰ� �����Ƿ� �����͸� �Ҵ��ؾ� �Ѵ�.
		//	CreditCard c = new CreditCard(); . error

		CreditCard c = new CreditCard("������ 1���");
		System.out.println(c.getInfo());
	}
}
