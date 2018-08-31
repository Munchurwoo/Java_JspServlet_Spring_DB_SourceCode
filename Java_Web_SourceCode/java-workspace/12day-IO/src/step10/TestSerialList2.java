package step10;

import java.io.IOException;
import java.util.ArrayList;

public class TestSerialList2 {
	public static void main(String[] args) {
		String path = "C:\\java-kosta\\test\\member_list.obj";
		SerialListService service = new SerialListService();
		ArrayList<Member> list;
		try {
			list = service.localList(path);
			System.out.println(path+"���Ͽ� ����� ����Ʈ�� ������ȭ�Ͽ� ���");
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i).getId()+" "+
						list.get(i).getPassword()+" "+ list.get(i).getName()+
						" "+list.get(i).getAddress());
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
