package step2;

import org.kosta.bank.KostaBank;

class AccessExam extends KostaBank{
	public void test() {
	/*	KostaBank bank=new KostaBank();
		bank.testPublic();*/
		testPublic();
		//��ӹ޾����Ƿ� �ٸ� ��Ű���� Ŭ������ 
		//protected method�� �����ؼ� ��밡�� 
		testProtected();
		// default �� private ���� ������ �޼���� �翬�� 
		// ����� �� ���� ( ��Ű���� �ٸ��Ƿ� )
	}
}
public class TestAccessModifier {
	public static void main(String[] args) {
		
	}
}



