package step1;
/*		java.lang.Throwable  �ڽ� Ŭ������ Error �� Ȯ���ϴ� ���� 
 *     ����� �߻��Ǵ� Error �� ���α׷��� �ɰ��� ������ ���ϰ�
 *     �� ��쿡�� �ڵ� ���� �Ǵ� ȯ�� ������ �ʿ��ϴ� 
 * 
 */
class ErrorEx{
	//���Ƿ� ������ �߻����� ���� 
	public void a() {
		System.out.println("a ����");
		b();
	}
	public void b() {
		System.out.println("b ����");
		a();
	}
}
public class TestError {
	public static void main(String[] args) {
		new ErrorEx().a();
	}
}







