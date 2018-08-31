package step9;

import java.util.Stack;

// last-in-first-out (LIFO)  후입선출 , 선입후출 
public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("아이유");//스택에 요소를 추가 
		stack.push("장소정");
		stack.push("심지영");
		stack.push("최요셉");
		System.out.println(stack);
		//가장 마지막에 추가된 요소가 가장 먼저 나온다 
		/*System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);*/
		// empty() 메서드를 이용해 모든 요소를 순차적으로 추출해
		// 출력해본다 
		while(!stack.empty()) {//비어있지 않을 동안 계속 수행 
			System.out.println(stack.pop());
		}		
		System.out.println(stack);//비어있다 
	}
}









