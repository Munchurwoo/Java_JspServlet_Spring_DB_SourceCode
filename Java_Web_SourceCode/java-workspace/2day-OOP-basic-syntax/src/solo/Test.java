package solo;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	    
		// 로그인 , 회원가입 선택 
		System.out.println("로그인은 1번, 회원가입은 2번을 클릭하세요.");
//		switch
		Loof1 : while(true) {
			Scanner scan = new Scanner(System.in);
		    System.out.println("아이디를 입력하세요.");
		    String id = scan.nextLine();
		    System.out.println("비밀번호를 입력하세요.");
		    int password = scan.nextInt();
		    
		    if(id.equals("mdnbo1")) {
		    	while(true){
			    	if(password==650301) {
			    		System.out.println("로그인 완료됬습니다.");
			    		break Loof1;
			    	}
			    	else {
			    		System.out.println("비밀번호를 다시 입력하세요.");
			    		password = scan.nextInt();
			    		continue;
			    	}
		    	}
		    } else {
		    	System.out.println("아이디가 틀렸습니다. 다시 입력하세요.");
		    	 id = scan.nextLine();
		    	continue;
		    }
		}
	}

}
