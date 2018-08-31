package step6;

public class TestDoWhile {
	public static void main(String[] args) {
		//do while 조건에 맞지 않아도 반드시 한번은 수행된다.
		int i =1;
		do {
			System.out.println(i);
			i++;
		}while(i<0);
	}
}
