package step8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import step7.Person;

/*
 * 객체 역직렬화 테스트 
 * 파일에 직렬화하여 저장된 객체 정보를 
 * 다시 heap 메모리 상의 객체로 복원하는 예제 
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
