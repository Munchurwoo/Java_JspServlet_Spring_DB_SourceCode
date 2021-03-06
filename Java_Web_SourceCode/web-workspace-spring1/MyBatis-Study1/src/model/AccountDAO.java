package model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import factory.SqlSessionFactoryManager;

public class AccountDAO {
	private static AccountDAO instance = new AccountDAO();
	//MyBatis Framework 를 이용하기 위한 팩토리 객체 
	private SqlSessionFactory factory;
	private AccountDAO() {
		factory=SqlSessionFactoryManager.getInstance().getFactory();
	}
	public static AccountDAO getInstance() {
		return instance;
	}
	public AccountVO findAccountById(String id) {
		AccountVO vo = null;
		SqlSession session = null;
		try {
			session = factory.openSession();
			vo=session.selectOne("account.findAccountById",id);
		}finally {
			session.close();
		}
		return vo;
	}
	public List<AccountVO> getAllAccountList() {
		List<AccountVO> list = null;
		SqlSession session = null;
		try {
			session= factory.openSession();
			list=session.selectList("account.getAllAccountList");
		}finally {
			session.close();
		}
		return list;
	}
}
