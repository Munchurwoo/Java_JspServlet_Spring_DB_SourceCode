package step7;

public class TestFor5 {
	public static void main(String[] args) {
		int data=7;
		exit:
		for(int i=1; i<6;i++) {
			for(int j=1; j<4;j++) {
				if(data==i+j) {
					
					//���� ��ü for���� ������� �� ��쿡�� 
					//lable�� �̿��Ѵ�. 
					break exit;
				}
				System.out.print(i+j+"");
			}
			System.out.println();
		}
	}
}
