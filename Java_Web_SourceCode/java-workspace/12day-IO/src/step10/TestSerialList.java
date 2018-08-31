package step10;

import java.io.IOException;
import java.util.ArrayList;

public class TestSerialList {
	public static void main(String[] args) {
		SerialListService service = new SerialListService();
		ArrayList<Member> list = new ArrayList<Member>();
		try {
			list.add(new Member("javaking", "abcd", "고슬링", "미국"));
			list.add(new Member("startjava", "1234", "신현수", "양재"));
			list.add(new Member("javaprince", "aaaa", "최요셉", "수원"));
			String path = "C:\\java-kosta\\test\\member_list.obj";
			service.saveList(path, list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("list를 직렬화하여 저장");
	}
}
