package step9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialObjectService {
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public SerialObjectService(String path) {
		super();
		this.path = path;
	}

	public void saveObject(Car car) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(car);
			System.out.println("car 객체 직렬화 파일에 저장");
		} finally {
			if (oos != null)
				oos.close();
		}
	}

	public Car loadObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		Car car = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(path));
			car = (Car) ois.readObject();
			ois.close();
		} finally {
			if (ois != null)
				ois.close();
		}
		return (Car) car;
	}
}
