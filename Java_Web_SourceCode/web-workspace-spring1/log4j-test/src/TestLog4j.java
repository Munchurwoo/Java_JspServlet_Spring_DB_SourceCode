import org.kosta.MemberController;

import model.MemberService;

public class TestLog4j {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		ms.register();
		MemberController mc = new MemberController();
		mc.testLog();
	}
}
