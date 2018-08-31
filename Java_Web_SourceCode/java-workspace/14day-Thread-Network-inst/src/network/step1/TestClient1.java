package network.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient1 {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null;
		BufferedReader br=null;
		try {
			socket=new Socket("127.0.0.1",5432);
			System.out.println("**client�� ������ ����**");
			InputStream is=socket.getInputStream();
			//1byte���� Stream�� 2byte���� Stream���� ��ȯ�ϴ� ��Ʈ��
			InputStreamReader ir=new InputStreamReader(is);
			br=new BufferedReader(ir);
			//������ ����� �����͸� �Է¹޴´� 
			String data=br.readLine();
			System.out.println("�������� ���� �޼���:"+data);						
		}finally {
			if(br!=null)
				br.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new TestClient1().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



