package org.kosta.bank;
//access modifier test를 위한 클래스 
public class KostaBank {
	public void testPublic() {
		System.out.println("testPublic ok~");
	}
	protected void testProtected() {
		System.out.println("testProtected ok~");
	}
	void testDefault() {
		System.out.println("testDefault ok~");
	}
	/* 어노테이션 ( Annotation ) 을 이용해
	 * warning 을 표시하지 않도록 처리한다 
	 * 참고) 어노테이션이란 의미있는 주석으로 
	 * 컴파일과 실행시 특정한 목적을 위해 사용한다 
	 */
	@SuppressWarnings("unused")
	private void testPrivate() {
		System.out.println("testPrivate ok~");
	}
}






