package step1;
/* java ���ڿ� Ŭ���� String �� StringBuilder �� ���ؼ� �����ϴ� ����
 * 
 */
public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String str="������";
		System.out.println(str);
		String str2="������";
		//���� ���� String�� �����ϸ� ������ ���ڿ��� heap ��������
		//���ڿ� ��� ������ �ϳ��� ���ڿ��� ����ǰ� 
		//���� �������� �����ϴ� ������� ���ȴ� 
		//������ ���ڿ��� �ݺ������� ���� �� �޸𸮿� ȿ������ ��� 
		//str2 ���ڿ� �ڿ� Ư�� ���ڿ��� �߰��Ѵ�
		System.out.println(str2.concat("���ִ�"));// String�̹Ƿ� ���� ���� 
		System.out.println(str2);//���� ���ڿ� ����ȵ� ( �Һ� ) 
		// StringBuilder ������� ���ڿ��� ������ ���� 
		StringBuilder sb=new StringBuilder("������");
		System.out.println(sb);
		//sb ���ڿ� �ڿ� ����� �̶�� ���ڿ��� �߰��� ���� 
		System.out.println(sb.append("�����"));//StringBuilder�̹Ƿ� �������ڿ� ����
		System.out.println(sb);//��ü�� ����ǹǷ� ����������� ��� 
	}
}









