package test6;
/*
 * ���ڿ� �񱳽ÿ��� == �����ڷ� ���� �ʰ� 
 * �ݵ�� equals(str) : boolean �޼��带 ����ؼ� ���� ���ڿ��� ���Ѵ�.
 */
public class TestStringEquals {
	public static void main(String[] args) {
		String str1="������";
		String str2="������";
		System.out.println(str1==str1);
		String str3=new String("������");
		System.out.println(str1==str3);
		StringBuilder sb = new StringBuilder("������");
		System.out.println(str1.equals(sb.toString()));
	}
}
