import java.util.List;

import model.AccountDAO;
import model.AccountVO;

public class TestMyBatis {
	public static void main(String[] args) {
		AccountDAO dao = AccountDAO.getInstance();
		/*AccountVO vo = dao.findAccountById("1");
		System.out.println("검색결과"+vo);*/
		List<AccountVO> list = dao.getAllAccountList();
		for(AccountVO vo :list)
			System.out.println(vo);
	}
}
