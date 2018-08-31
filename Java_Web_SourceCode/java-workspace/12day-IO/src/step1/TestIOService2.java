package step1;

import java.io.IOException;

public class TestIOService2 {
	public static void main(String[] args) {
		
		try {
			String savePath ="C:\\java-kosta\\test\\menu\\order.txt";
			MenuIOService service = new MenuIOService(savePath);
			service.orderMenu(savePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
