package model;

public class PointImpl implements PointDAO {

	@Override
	public void register(String memberInfo, int point) {
		System.out.println(memberInfo+"회원에"+point+"포인트 point 테이블에 insert");
	}

}
