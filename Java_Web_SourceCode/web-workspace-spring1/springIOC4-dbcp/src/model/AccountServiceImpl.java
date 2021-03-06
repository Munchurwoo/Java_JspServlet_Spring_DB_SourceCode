package model;
public class AccountServiceImpl implements AcountService {
	private AccountDAO accountDAO;
	//스프링 컨테이너로부터 accountDAO 타입의 구현체를 주입 
	
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}
	@Override
	public AccountVO findAccountById(String id) {
		return accountDAO.findAccountById(id);
	}
}
