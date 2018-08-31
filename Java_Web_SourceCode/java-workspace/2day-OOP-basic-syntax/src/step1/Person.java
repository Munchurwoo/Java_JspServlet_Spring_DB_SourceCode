/*
 *  ��Ű�� ����� : clas�� ���丮���� �з��ؼ� ���� 
 *  					   ��Ű���� �ҹ��ڷ� ��� 
 *  					   
 */
package step1;
/*
 * Ŭ���� ����� : class�� object�� ���赵 
 * public : ���� ������ access modifier  ���� ���� ������ ���� ������ 
 * ���� �������� ������ 
 * public > protected > default > private 
 * public : ��𼭳� ���� ���� 
 * protected : ��Ű�� ������ ���ٰ���  ��, ��Ӱ���ÿ��� �ٸ� ��Ű�������� ���� ���� 
 * default : ������ ��Ű�� �������� ���� ���� 
 * private : �ٸ� Ŭ�������� ���� �Ұ� 
 * 
 * person�� class ��, Ŭ�������� �빮�ڷ� ���� 
 * �ռ����� ù���ڴ� �빮��, �������� �ҹ��� 
 * ex) MyHouse 
 * 
 */
public class Person {
	/*
	 * ���� ( variable or attribute ) �� ���� 
	 * -> ������ ��ü�� �Ӽ� ������ �����ϱ� ���� ���� 
	 */
	
	public String name;
	public int age;
	/*
	 * �޼���: ��ü�� ����� ���� 
	 * public : ���� ������ 
	 * void : ���� ���� ���� �� ����ϴ� �ڹ�Ű���� 
	 * eat : �޼����, ������ ��Ģ�� ���� 
	 * �ҹ��ڷ� ����, �ռ����� ù���ڴ� �빮�� 
	 * ex) findMemberInfoById  
	 */
	public void eat() {
		System.out.println(name+"���� �Ծ����ϴ�.");
	}
	/*int time  :  �޼����� �Ű����� 
	*�޼��带 ȣ���� ������ ������ �����͸� �ޱ� ���� ���� 
	*void : �޼��尡 �����͸� �������� ���� �� ����ϴ� Ű���� 
	*�� �޼���� ���ϰ��� ���� ��� ǥ�� 
	*/
	public void sleep(int time) {
		System.out.println(name+"����"+time+"�ð� �ڴ�");
	}
	public void study(String subject, int time) {
		System.out.println(name+"����"+subject+" "+time+"�ð� �����ϴ�.");
	}
	/*
	 * String : ������ �������� Ÿ�� 
	 * ���� Ÿ���̶�� �Ѵ�. 
	 */
	public String getDetailInfo() {
		return "�̸�: "+name+" ����:"+age;
	}
}
