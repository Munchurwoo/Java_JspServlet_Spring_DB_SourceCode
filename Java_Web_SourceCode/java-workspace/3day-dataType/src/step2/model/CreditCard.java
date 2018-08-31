package step2.model;

public class CreditCard {
	/*
	 * 생성자 Constructor 를 명시하지 않으면
	 * 컴파일시에 자동 삽입된다. 
	 * 생성자를 명시하면 삽입하지 않는다. 
	 * 생성자는 클래스명과 동일해야 된다. 
	 * 생성자를 명시하는 주된 이유는 객체 생성 시점에 필요한 정보를 전달 받기 위해서 명시한다. 
	 * ex) 신용카드 객체 - 개인정보 필수 
	 */
	private String info;
	
	public CreditCard(String info) {
		System.out.println("생성자 실행");
		// 만약 개인정보가 출력되지 않으면 exception 발생시켜 객체 생성을 하지 않을 수 있다. 
		this.info=info;
	}
		public String getInfo() {
			return info;
		}
}
