package model;
/*
 * 	view의 EL 은 GET과 IS 계열의 메서드에 접근 가능하다 
 * 	getName() - > EL ${vo.name} 
 * 	isPerson() -> EL ${vo.person}
 */
public class TestVO {
	public String getName() {
		return "방탄소년단";
	}
	public String findNick() {
		return "강동원";
	}
	public boolean isPerson() {
		return false;
	}
}
