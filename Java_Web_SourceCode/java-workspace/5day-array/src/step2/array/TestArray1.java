package step2.array;
/*
 * Primitive Data Type �� data�� �����ϴ� �迭 
 */
public class TestArray1 {
	public static void main(String[] args) {
		// 1. �迭 ���� 
		int age[]; // 
		// 2. �迭 ���� 
		age=new int[3]; // heap ������ �迭 ��ü ���� 
		System.out.println(age[0]); // �������̹Ƿ� 0���� �ʱ�ȭ �Ǿ� �ִ�. 
		//�迭 ��ҿ� ������ �Ҵ� 
		age[0]=26;
		age[1]=30;
		age[2]=18;
		System.out.println(age.length);
		System.out.println("***for���� �̿��ؼ� ��� ����� ���̸� ��� ***");
		for(int i =0;i<age.length;i++) {
			System.out.println(age[i]);
		}
 	}
}	
