package model;

public class MemberServiceImpl implements MemberService {
	@Override
	public void updateMember() {
		System.out.println("MemberService updateMember");
		//공통관심사항
		System.out.println(
				"MemberService updateMember 메서드 실행 후 수행완료시간기록");
	}
	@Override
	public void deleteMember() {
		System.out.println("MemberService deleteMember");
		//공통관심사항
				System.out.println(
						"MemberService deleteMember 메서드 실행 후 수행완료시간기록");
	}
	@Override
	public void getAllMember() {
		System.out.println("MemberService getAllMember");
		//공통관심사항
		System.out.println(
				"MemberService getAllMember 메서드 실행 후 수행완료시간기록");
	}
	// 그 외 많은 메서드가 있다고 가정한다 
}
