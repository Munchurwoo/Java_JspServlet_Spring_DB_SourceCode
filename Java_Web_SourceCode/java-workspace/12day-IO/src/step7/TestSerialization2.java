package step7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//��ü ����ȭ �׽�Ʈ
//�Ʒ� ������ java.io.NotSerializableException:step7.Animal �� �߻��Ѵ�. 
// ��ü ����ȭ �Ǳ� ���ؼ��� implements Serialization
public class TestSerialization2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos= new FileOutputStream
					("C:\\java-kosta\\test\\person.obj");
			Person p = new Person("������",26);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(p);
			System.out.println("Aninal ��ü ����ȭ ���Ͽ� ����");
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
