package solo;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	    
		// �α��� , ȸ������ ���� 
		System.out.println("�α����� 1��, ȸ�������� 2���� Ŭ���ϼ���.");
//		switch
		Loof1 : while(true) {
			Scanner scan = new Scanner(System.in);
		    System.out.println("���̵� �Է��ϼ���.");
		    String id = scan.nextLine();
		    System.out.println("��й�ȣ�� �Է��ϼ���.");
		    int password = scan.nextInt();
		    
		    if(id.equals("mdnbo1")) {
		    	while(true){
			    	if(password==650301) {
			    		System.out.println("�α��� �Ϸ����ϴ�.");
			    		break Loof1;
			    	}
			    	else {
			    		System.out.println("��й�ȣ�� �ٽ� �Է��ϼ���.");
			    		password = scan.nextInt();
			    		continue;
			    	}
		    	}
		    } else {
		    	System.out.println("���̵� Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���.");
		    	 id = scan.nextLine();
		    	continue;
		    }
		}
	}

}
