package step10;

import java.io.IOException;
import java.util.ArrayList;

public class TestSerialList {
	public static void main(String[] args) {
		SerialListService service = new SerialListService();
		ArrayList<Member> list = new ArrayList<Member>();
		try {
			list.add(new Member("javaking", "abcd", "����", "�̱�"));
			list.add(new Member("startjava", "1234", "������", "����"));
			list.add(new Member("javaprince", "aaaa", "�ֿ��", "����"));
			String path = "C:\\java-kosta\\test\\member_list.obj";
			service.saveList(path, list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("list�� ����ȭ�Ͽ� ����");
	}
}
