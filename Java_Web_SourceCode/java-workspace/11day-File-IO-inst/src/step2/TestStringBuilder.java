package step2;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("������");
		System.out.println(sb.append("����"));
		System.out.println(sb);//���ڿ� ��ü�� ���� 
		System.out.println(sb.length());
		System.out.println(sb.charAt(1));//�ε����� �ش��ϴ� ���ڿ� ��ȯ 
		System.out.println(sb.indexOf("��"));//���ڿ��� �ش��ϴ� �ε��� ��ȯ
		System.out.println(sb.indexOf("��"));//������ -1 ��ȯ 
		String name="����������";
		// String name �� StringBuilder sb�� �� 
		// StringBuilder�� String ���� �����ؼ� ���ؾ� �Ѵ� 
		System.out.println(name.equals(sb.toString()));
		StringBuilder sb1=new StringBuilder("������");
		StringBuilder sb2=new StringBuilder("������");
		System.out.println(sb1==sb2);//sb1 �� sb2 �� �ٸ� ��ü�̱� ���� 
		//StringBuilder�� String ó�� equals �޼��尡 �������̵� �Ǿ� ���� �ʴ�
		//Object �� equals �޼���� �ּҰ� ���̹Ƿ� false 
		System.out.println(sb1.equals(sb2));
		//�Ʒ�ó�� toString() ���� String���� ���� �� ���ϸ� �ȴ� 
		//String class �� equals �޼��带 �������̵��Ͽ� ���� ���ڿ��� 
		//���ϵ��� ���������Ƿ� 
		System.out.println(sb1.toString().equals(sb2.toString()));
		StringBuilder sb3=new StringBuilder("����");
		sb3.append("�尡����");
		System.out.println(sb3.reverse());
	}
}








