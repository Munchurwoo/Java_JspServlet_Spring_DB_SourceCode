package step9;

import java.util.Stack;

// last-in-first-out (LIFO)  ���Լ��� , �������� 
public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("������");//���ÿ� ��Ҹ� �߰� 
		stack.push("�����");
		stack.push("������");
		stack.push("�ֿ��");
		System.out.println(stack);
		//���� �������� �߰��� ��Ұ� ���� ���� ���´� 
		/*System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);*/
		// empty() �޼��带 �̿��� ��� ��Ҹ� ���������� ������
		// ����غ��� 
		while(!stack.empty()) {//������� ���� ���� ��� ���� 
			System.out.println(stack.pop());
		}		
		System.out.println(stack);//����ִ� 
	}
}









