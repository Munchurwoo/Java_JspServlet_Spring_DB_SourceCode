package step6;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	public void go() throws UnknownHostException, IOException {
		String ip="192.168.0.176"; //자신의 컴퓨터 ip ( 서버ip )
		int port = 5432 ; //서버 port 
		Socket socket = new Socket(ip,port);
		System.out.println("client 가 server에 접속했음");
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
