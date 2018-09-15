package model;

public class MemberServiceImpl implements MemberService {
	@Override
	public void updateMember() {
		System.out.println("MemberService updateMember");
		//공통관심사항
	}
	@Override
	public void deleteMember() {
		System.out.println("MemberService deleteMember");
	}
	@Override
	public void getAllMember() {
		System.out.println("MemberService getAllMember");
	}
	// 그 외 많은 메서드가 있다고 가정한다 
}
