package model;

public class memberDAOImpl implements MemberDAO{

	@Override
	public void register(String memberInfo) {
		System.out.println(memberInfo+"회원테이블에 insert");
	}

}
