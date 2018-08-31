package step8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import step7.Person;

/*
 * ��ü ������ȭ �׽�Ʈ 
 * ���Ͽ� ����ȭ�Ͽ� ����� ��ü ������ 
 * �ٽ� heap �޸� ���� ��ü�� �����ϴ� ���� 
 */
public class TestDeSerialization {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\person.obj";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p=(Person)ois.readObject();
			System.out.println(p.getName()+" "+p.getAge());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
