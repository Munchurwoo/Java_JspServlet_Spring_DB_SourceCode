package step3;

public class TestString {
	public static void main(String[] args) {
		String name="�̼���";
		System.out.println(name.concat("������"));//���� ���� 
		System.out.println(name);//�Һ� �Ӽ��̹Ƿ� �̼����� �״�� ��� 
		System.out.println(name.indexOf("��"));//1
		System.out.println(name.indexOf("��"));//-1
		System.out.println(name.startsWith("��"));//�� ���ڿ��� �����ϸ� true
		System.out.println(name.startsWith("��"));
		// �� ���ڿ��� ������ true 
		System.out.println(name.endsWith("��"));
		String fileName="���ɸ޴�.txt";
		//Ȯ���ڰ� .txt �̸� true 
		System.out.println(fileName.endsWith(".txt"));
		String name2="javaking";
		//�빮�ڷ� ���� 
		System.out.println(name2.toUpperCase());
		System.out.println(name2.substring(3));//index 3���� ���ڿ� ����
		String name3="�����������";
		//�������� ���ڿ��� �����ؼ� ��� 
		System.out.println(name3.substring(1,5));//1���� 5�ձ��� 
		String friends="�����,���ػ�,��ö��,�̵���";
		String names[]=friends.split(",");//,�����ڸ� �������� ���ڿ� �迭 ��ȯ
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);
	}
}







