package review;
// Exception Handing 복습 예제 
public class TestException {
	public static void main(String[] args) {
		AccountService service=new AccountService();
		int money=10;//정상적인 데이터  
		money=-1;//문제 있는 데이터  - 예외 발생 
		try {
			service.deposit(money);
			System.out.println("c");
		} catch (InvalidMoneyException e) {			
			System.out.println(e.getMessage());//Exception 메세지만 출력 
		//	e.printStackTrace(); // Excepiton 상세 정보를 출력 
			System.out.println("d");
		}
		System.out.println("e");
	}
}





