package step8;
/*
 * 2���� �迭 �׽�Ʈ 
 */
public class Test2DArray {
	public static void main(String[] args) {
		//3�� ���� ���췮�� �������� 
		int rain [][];
		rain=new int[3][12];
		System.out.println(rain.length);
		System.out.println(rain[0].length);
		System.out.println("*************");
		// �Ǳ����б� 1�г� 3��, 2�г� 2��, 3�г� 4�� 
		// file f = new file();
		//close();
		int ms[][];
		
		ms=new int[3][];
		ms[0]=new int[3];
		ms[1]=new int[2];
		ms[2]=new int[4];
		
		//������ �г��� ������ ���� �������� 20�� �����غ���. 
		ms[2][3] =20;
	}
}
