package step10;

import java.util.LinkedList;
import java.util.Queue;

// Queue : ���Լ���  First In First Out 
public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.add("�ȳ� ���������");
		queue.add("���� ���׻���");
		queue.add("����� �� ����?");
		queue.add("�ٸ� ����� ���� �Ŵ�TT");
		queue.add("�����~");
		// isEmpty()  : boolean 
		// poll() 
		// ���� �߰��� ��Ұ� ���� ���� ���´� 
		while(!queue.isEmpty())
			System.out.println(queue.poll());
		System.out.println(queue);
	}
}









