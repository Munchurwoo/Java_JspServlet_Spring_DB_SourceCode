package review;

public class AccountService {
	/**
	 * money�� 0�� �ʰ��ϸ� ���� �Ա� ó�� money �� 0 �����̸� InvalidMoneyException �� �߻���Ű�� throws
	 * ó���Ѵ�.
	 */
	public void deposit(int money) throws InvalidMoneyException{
		// TODO Auto-generated method stub
		try {
		if (money <= 0)
			throw new InvalidMoneyException(money + "���� �߸��� �Աݾ��Դϴ�.");
		System.out.println(money + "�� �ԱݿϷ� ");
		System.out.println("a");
		}finally {
			System.out.println("b");
		}
	}
}
