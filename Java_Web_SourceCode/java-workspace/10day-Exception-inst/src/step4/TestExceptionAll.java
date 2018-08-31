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
					throw new InvalidNickException("������ �Է��ϼ���");
				}
				System.out.println("a");
				System.out.println("ȸ�� �����ͺ��̽��� ���� ���:"+nick);
			}finally {
				System.out.println("b");
			}	
		}
}
public class TestExceptionAll {
	/*
	 *  try catch finally throws throw �� Ȱ���ϴ� ���� 
	 *  ���� �帧�� �����غ��� 
	 */
	public static void main(String[] args) {
		MemberService service=new MemberService();
		String nick=null;
		//nick="";
		nick="�Ź���";
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






