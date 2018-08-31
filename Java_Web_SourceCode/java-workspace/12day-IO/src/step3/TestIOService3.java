package step3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class TestIOService3 {
	public static void main(String[] args) {
		//try 
		
		try {
			String filePath ="C:\\java-kosta\\test\\menu\\order.txt";
			SelectIOService service = new SelectIOService(filePath);
			System.out.println(filePath+"에 저장된 메뉴리스트");
			ArrayList<String> list = service.getMenuList();
			System.out.println(list.get(2));
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}
}
