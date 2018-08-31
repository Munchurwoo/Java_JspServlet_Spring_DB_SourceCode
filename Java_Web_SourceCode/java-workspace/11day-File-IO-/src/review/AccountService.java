package review;

public class AccountService {
	/**
	 * money가 0을 초과하면 정상 입금 처리 money 가 0 이하이면 InvalidMoneyException 을 발생시키고 throws
	 * 처리한다.
	 */
	public void deposit(int money) throws InvalidMoneyException{
		// TODO Auto-generated method stub
		try {
		if (money <= 0)
			throw new InvalidMoneyException(money + "원은 잘못된 입금액입니다.");
		System.out.println(money + "원 입금완료 ");
		System.out.println("a");
		}finally {
			System.out.println("b");
		}
	}
}
