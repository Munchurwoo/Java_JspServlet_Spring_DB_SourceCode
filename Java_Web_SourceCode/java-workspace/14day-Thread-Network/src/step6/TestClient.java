package step6;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	public void go() throws UnknownHostException, IOException {
		String ip="192.168.0.176"; //�ڽ��� ��ǻ�� ip ( ����ip )
		int port = 5432 ; //���� port 
		Socket socket = new Socket(ip,port);
		System.out.println("client �� server�� ��������");
		socket.close();
	}
	public static void main(String[] args) {
		try {
			new TestClient().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
