package step2.array;

public class TestArray4 {
	public static void main(String[] args) {
		int point[] = {30,50,10,20,100};
		int minPoint=Integer.MAX_VALUE;
		//for  ���� �̿��� �ּҰ��� minPoint�� �Ҵ� 
		for(int i=0;i<point.length;i++) {
			if(minPoint>point[i]) {
				minPoint=point[i];
			}
		}
		System.out.println("�迭 ����� �ּҰ�"+minPoint);
		
	}
}
