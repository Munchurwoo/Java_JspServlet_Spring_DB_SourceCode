package step1;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {
	public static void main(String[] args) {
		/*List list=new ArrayList();
		list.add("������");
		list.add("�㵵��");
		list.add("������");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(1));
		//String class�� �޼��带 �̿��� �̸��� �������� Ȯ�� 
		String name="����������";
		System.out.println(name.length());
		// list �� 2��° ����� ���ڿ� ���̸� ����ϰ��� �Ѵ� 
		String str=(String)list.get(1);//Object Ÿ���̹Ƿ� ĳ������ �ʿ��ϴ�
		System.out.println(str.length());
		list.add(false);*/// �ٸ� ������ �����Ͱ� ����� ���� �ִ� 
		// �Ʒ�ó�� ����� Ÿ���� Generic ���� �����ϸ� 
		// ��ü ĳ���� ������ �����ϰ� �������� ������ ������ �� �ִ� 
		List<String> nameList=new ArrayList<String>();
		nameList.add("������");
		nameList.add("�㵵��");
		nameList.add("������");
		//������ ĳ���� ���� �ٷ� String class�� �޼��� ��밡�� 
		System.out.println(nameList.get(1).length());
		for(int i=0;i<nameList.size();i++)
			System.out.println(nameList.get(i));		
		nameList.set(2, "���̸�");//�ش� �ε����� ������ ���� 
		System.out.println(nameList.get(2));
		nameList.remove(0); // ù��° ��Ҹ� ���� 
		System.out.println(nameList);
		System.out.println(nameList.contains("�̼���"));
		System.out.println(nameList.contains("�㵵��"));
		nameList.clear();
		System.out.println(nameList);
	}
}
























