package step9;

import java.io.IOException;

public class TestSerialObject {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\car.obj";
		SerialObjectService service = new SerialObjectService(path);
		Car car;
		try {
			car = service.loadObject();
			System.out.println(car.getModel()+" "+ car.getPrice());
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
