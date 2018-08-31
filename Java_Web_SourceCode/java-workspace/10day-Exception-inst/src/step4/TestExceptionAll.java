package step4;
// null or ""
// Use defined Exception 
class InvalidNickException extends Exception{
	private static final long serialVersionUID = -8696726738915943298L;
	public InvalidNickException(String message) {
		super(message);
	}
}
class MemberService{
		public void registerNick(String nick) throws InvalidNickException {
			try {
				if(nick==null || nick.equals("")) {
					throw new InvalidNickException("별명을 입력하세요");
				}
				System.out.println("a");
				System.out.println("회원 데이터베이스에 별명 등록:"+nick);
			}finally {
				System.out.println("b");
			}	
		}
}
public class TestExceptionAll {
	/*
	 *  try catch finally throws throw 다 활용하는 예제 
	 *  실행 흐름을 예상해본다 
	 */
	public static void main(String[] args) {
		MemberService service=new MemberService();
		String nick=null;
		//nick="";
		nick="신반장";
		try {
			service.registerNick(nick);
			System.out.println("c");
		} catch (InvalidNickException e) {
			System.out.println(e.getMessage());
			System.out.println("d");
		}
		System.out.println("e");
	}
}






