package step6.test;

import step6.model.Friend;

//���� ������ ���� ���� 
public class TestReferenceVariable {
	public static void main(String[] args) {
		/*
		 * Friend : reference data type 
		 * f : reference variable 
		 * = :assign �Ҵ� 
		 * new : ��ü������ ����ϴ� Ű���� 
		 * Friend() : Constructor ������ 
		 */
		Friend f  = new Friend("������");
		// �����ڿ� ���� �ʱ�ȭ�� �������� ����ǹǷ� ������� �ƴ϶� �������� ��� 
		System.out.println(f.getName());
		//�ν��Ͻ� ������ ������� �ʱ�ȭ�� 1�� ��� 
		System.out.println(f.getAge());
		// ���� �Ǿ����Ƿ� int���� �⺻�� 0�� ��� 
		System.out.println(f.getMoney());
		System.out.println(f.getAddress());
		
	}
}
