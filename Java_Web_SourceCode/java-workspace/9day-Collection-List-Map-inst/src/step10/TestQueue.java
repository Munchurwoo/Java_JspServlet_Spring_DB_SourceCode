package step10;

import java.util.LinkedList;
import java.util.Queue;

// Queue : 선입선출  First In First Out 
public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.add("안녕 요셉오빠야");
		queue.add("머해 뿌잉뿌잉");
		queue.add("대답이 왜 없지?");
		queue.add("다른 사람이 생긴 거니TT");
		queue.add("헤어져~");
		// isEmpty()  : boolean 
		// poll() 
		// 먼저 추가된 요소가 가장 먼저 나온다 
		while(!queue.isEmpty())
			System.out.println(queue.poll());
		System.out.println(queue);
	}
}









