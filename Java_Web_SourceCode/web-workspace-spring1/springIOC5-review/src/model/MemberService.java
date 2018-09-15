package model;

public interface MemberService {
	public void setMemberDAO(MemberDAO memberDAO);
	public void setPointDAO(PointDAO pointDAO);
	public void registerMemberAndPoint(String memberInfo, int point);
}
