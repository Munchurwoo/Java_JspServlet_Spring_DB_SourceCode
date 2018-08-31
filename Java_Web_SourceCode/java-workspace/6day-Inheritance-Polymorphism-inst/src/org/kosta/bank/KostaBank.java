package org.kosta.bank;
//access modifier test�� ���� Ŭ���� 
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
	/* ������̼� ( Annotation ) �� �̿���
	 * warning �� ǥ������ �ʵ��� ó���Ѵ� 
	 * ����) ������̼��̶� �ǹ��ִ� �ּ����� 
	 * �����ϰ� ����� Ư���� ������ ���� ����Ѵ� 
	 */
	@SuppressWarnings("unused")
	private void testPrivate() {
		System.out.println("testPrivate ok~");
	}
}






