package step7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

class ItemService{
	public Collection<String> requestInfo(String type) {
		Collection<String> c=null;
		if(type.equals("����")) {
			c=new LinkedHashSet<String>();
			c.add("�ƿ��"); c.add("�ҳ�Ÿ");
		}else if(type.equals("���")) {
			c=new ArrayList<String>();
			c.add("������9"); c.add("G7"); c.add("������8");
		}
		return c;
	}
}
public class TestIterator2 {
	public static void main(String[] args) {
		ItemService service=new ItemService();
		String type="����";
		type="���";
		Collection<String> c=service.requestInfo(type);
		// LinkedHashSet ����ü�̵� , ArrayList ����ü�̵� �������
		// ǥ��ȭ�� ������� ��ҵ��� �ݺ� ������ �� �ִ� 
		Iterator<String> it=c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}






