package step7;

public class TestFor4 {
	public static void main(String[] args) {
		/*
		 * 2*2=2 
		 * ...
		 * 9*9=81
		 */
		for(int i = 2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+i*j +" ");
			}
			System.out.println();
		}
	}
}
