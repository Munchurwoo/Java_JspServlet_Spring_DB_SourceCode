package step13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInputFile2 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\output.txt";	
		try {
			BufferedReader br=new BufferedReader(new FileReader(path));
			// ���ڿ��� ������ ������ ��� ����ϵ��� �ڵ�~
			String line=br.readLine();//�� ������ �Է¹޴´�
			while(line!=null) {//null �� �ƴҶ����� �ݺ��Ѵ� 
				System.out.println(line);
				line=br.readLine();//���� ������ �д´� 
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}








