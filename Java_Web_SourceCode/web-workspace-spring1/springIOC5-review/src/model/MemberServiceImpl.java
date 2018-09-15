package model;
/*
 * 비즈니스 계층에서 사용되는 클래스 
 * 여러 DAO 를 연동 해서 업무를 정의한다. 
 */
public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	private PointDAO pointDAO;
	//스프링 컨테이너로부터 DI
	@Override
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	//Spring 컨테이너로부터 DI
	@Override
	public void setPointDAO(PointDAO pointDAO) {
		this.pointDAO = pointDAO;
	}

	@Override
	public void registerMemberAndPoint(String memberInfo, int point) {
		//트랜잭션 처리 필요(commit, rollback)-> 이후 공부 예정
		memberDAO.register(memberInfo);
		pointDAO.register(memberInfo, point);
	}

}