package step2;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		/*ArrayList list=new ArrayList();
		list.add(new Friend("���̸�", "���", 26));
		//����Ʈ ù��° ����� address �� ���Ϲ޾� ��� 
		Friend f=(Friend)list.get(0);//Generic �� ������� �ʾ� ĳ���� 
		System.out.println(f.getAddress());*/
		//Generic �� �����ؼ� ����Ʈ�� �����Ѵ� 
		ArrayList<Friend> list=new ArrayList<Friend>();
		list.add(new Friend("���̸�", "���", 26));
		System.out.println(list.get(0).getAddress());//��� 
		list.add(new Friend("�̼���", "����", 28));
		list.add(new Friend("�㵵��", "�̱�", 26));
		System.out.println("***27�� ���� ģ���� name�� age�� ���***");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()<=27) {
				System.out.println(list.get(i).getName()+" "+list.get(i).getAge());
			}//if
		}//for
		String address="����";
		System.out.println("**������ ��� ģ���� �̸� ���**");
		for(int i=0;i<list.size();i++) {
			if(address.equals(list.get(i).getAddress())) {
				System.out.println(list.get(i).getName());
			}
		}
	}
}









