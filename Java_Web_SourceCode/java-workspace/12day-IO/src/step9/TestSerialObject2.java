package step9;

import java.io.IOException;

public class TestSerialObject2 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\car.obj";
		SerialObjectService service = new SerialObjectService(path);
		//try
		try {
			service.saveObject(new Car("SM5",2000));
			System.out.println("���Ͽ� ����ȭ�Ͽ� Car ��ü ����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//catch
	}
}
