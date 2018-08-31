package step7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//객체 직렬화 테스트
//아래 예제는 java.io.NotSerializableException:step7.Animal 이 발생한다. 
// 객체 직렬화 되기 위해서는 implements Serialization
public class TestSerialization2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos= new FileOutputStream
					("C:\\java-kosta\\test\\person.obj");
			Person p = new Person("아이유",26);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(p);
			System.out.println("Aninal 객체 직렬화 파일에 저장");
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
