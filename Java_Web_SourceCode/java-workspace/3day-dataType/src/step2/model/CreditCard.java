package step2.model;

public class CreditCard {
	/*
	 * ������ Constructor �� ������� ������
	 * �����Ͻÿ� �ڵ� ���Եȴ�. 
	 * �����ڸ� ����ϸ� �������� �ʴ´�. 
	 * �����ڴ� Ŭ������� �����ؾ� �ȴ�. 
	 * �����ڸ� ����ϴ� �ֵ� ������ ��ü ���� ������ �ʿ��� ������ ���� �ޱ� ���ؼ� ����Ѵ�. 
	 * ex) �ſ�ī�� ��ü - �������� �ʼ� 
	 */
	private String info;
	
	public CreditCard(String info) {
		System.out.println("������ ����");
		// ���� ���������� ��µ��� ������ exception �߻����� ��ü ������ ���� ���� �� �ִ�. 
		this.info=info;
	}
		public String getInfo() {
			return info;
		}
}
