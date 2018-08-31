package step7;

public class TestFor5 {
	public static void main(String[] args) {
		int data=7;
		exit:
		for(int i=1; i<6;i++) {
			for(int j=1; j<4;j++) {
				if(data==i+j) {
					
					//만약 전체 for문을 벗어나고자 할 경우에는 
					//lable을 이용한다. 
					break exit;
				}
				System.out.print(i+j+"");
			}
			System.out.println();
		}
	}
}
