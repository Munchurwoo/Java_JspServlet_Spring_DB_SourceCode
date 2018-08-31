package step3;
/*	  throws �� throw keyword �� �̿��� ���� 
 *   throws : �޼��� ����� �������� ����ϰ�
 *   �ش� �޼��� ����� �߻��Ǵ� ���ܸ� 
 *   ȣ���� ������ ���� �� �ִٴ� �ǹ��� Ű���� 
 *   throw : Ư�� ������ ������ ��� ���ܸ� 
 *   			  �߻���Ų�� 
 * 
 */
class Person{
	private int age;
	// throws �� ����ؼ� ���� �߻��� ȣ���� ������ ���� 
	public void setAge(int age) throws InvalidAgeException {
		if(age>0)
			this.age=age;
		else //�߸��� �����̹Ƿ� AgeException �߻�
			throw new InvalidAgeException(age+" ���� ������ �ƴ��ݾ�");
	}
	public int getAge() {
		return age;
	}	
}
public class TestThrows2 {
	public static void main(String[] args) {
		Person p=new Person();
		try {
			p.setAge(-1);
			System.out.println("����:"+p.getAge());
		} catch (InvalidAgeException e) {			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}









