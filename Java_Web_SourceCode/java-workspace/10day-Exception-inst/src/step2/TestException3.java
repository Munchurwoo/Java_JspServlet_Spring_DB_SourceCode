package step2;

import java.util.ArrayList;

public class TestException3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("������");
		list.add("������");
		try {
		//�Ʒ� �ڵ尡 ����Ǹ� NumberFormatException �� �߻��Ǵ� �� 
		//������ 	NumberFormatException �� ó���ϴ� catch ������ �����Ƿ�
		//	catch(Exception e) {} �� ����ȴ� 
//		System.out.println(Integer.parseInt("��"));
		System.out.println(list.get(2));		
		//�ϳ��� try ���� ���� catch �� ������ ���� ���� 
		// ��ü���� ����(�ڽ�) -> �߻��� ���� (�θ�) ������ ����ؾ�
		}catch (IndexOutOfBoundsException ie) {
			System.out.println("����Ʈ ��� ������ �ʰ�����~");
		}catch(Exception e) {
			e.printStackTrace();//Exception �޼����� ��� ��� 
		}
		System.out.println("���α׷� ���� ����");
	}
}







