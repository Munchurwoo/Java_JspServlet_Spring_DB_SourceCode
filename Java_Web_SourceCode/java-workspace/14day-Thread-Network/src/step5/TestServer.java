package step5;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import network.step1.TestServer1;

public class TestServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			int port = 5432;
			serverSocket = new ServerSocket(port);
			System.out.println("**����**");
			//���������� Ŭ���̾�Ʈ�� �����ϱ� ���� 
			//Ŭ���̾�Ʈ �Ѹ� ������ ������ while�� �ѹ� ����ȴ�
			while (true) { 
				// accept : ����ϴ� Ŭ���̾�Ʈ �����ϸ� ����
				Socket socket = null;
				PrintWriter out = null;
				try {
					socket = serverSocket.accept();//Ŭ���̾�Ʈ ���ӽ� Ȱ��ȭ
					System.out.println(socket.getInetAddress()+" client ����");
					out = new PrintWriter(socket.getOutputStream());
					out.println("�氡�氡");
				} finally {
					if (out != null)
						out.close();
					if (socket != null)
						socket.close();
				}
			} // while
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new TestServer1().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}