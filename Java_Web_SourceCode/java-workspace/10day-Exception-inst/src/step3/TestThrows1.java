package step3;

import java.io.FileNotFoundException;
import java.io.FileReader;

class MemoService{
	/*	 fileName �� �ش��ϴ� ������ �������� ������ 
	 *  FileReader �� �����ڴ� FileNotFoundException�� �߻���Ű��
	 *  ȣ���� �Ʒ� �ڵ�� �ش� Exception�� ������ 
	 *  �� �� try catch(����ó��) �Ǵ� throws�� ���ܸ� ó������ �ʰ�
	 *  �ڽ�(readMemo) �� ȣ���� ������ Exception �� ���� 
	 *  ���� ó���� �����Ѵ�  
	 *  
	 */
	public void readMemo(String fileName) throws FileNotFoundException {
		FileReader f=new FileReader(fileName);
		System.out.println(fileName+" ���� �б� �۾�");	
		System.out.println(1);
	}
}
public class TestThrows1 {
	public static void main(String[] args)  {
		String path="C:\\java-kosta\\a2.txt";
		 path="C:\\java-kosta\\a.txt";
		MemoService service=new MemoService();
		try {
			service.readMemo(path);
			System.out.println("�޸� �б� �۾� ��   �ļ��۾�");
			System.out.println(2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(3);
		}finally {
			System.out.println(4);
		}
		System.out.println("���α׷� �������");
		System.out.println(5);
	}
}






