package step12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* IO ����� ��Ʈ�� �׽�Ʈ 
 * File ���� �� 
 * ������ ����Ͽ� �����ϴ� ���� 
 */
public class TestOutputFile {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\output.txt";
		try {
			// FileWriter �� ������ ������ ���� ���� 
			FileWriter fw=new FileWriter(path,true);//true : append ���� �߰�
			System.out.println("������ ������ ���� ���� ����");
			PrintWriter pw=new PrintWriter(fw);
			pw.println("���� ����~");//���Ͽ� ���ڿ��� ��� 
			pw.close();
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
}







