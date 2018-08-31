package network.step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer1 {
	public void go() throws IOException {
		ServerSocket serverSocket= null;
		try {
			int port =5432;
			serverSocket = new ServerSocket(port);
			System.out.println("**����**");
			while(true) {
			Socket socket= null;
			PrintWriter out=null;
			try {
				socket = serverSocket.accept(); // ����ϴٰ� Ŭ���̾�Ʈ �����ϸ� ���� 
				System.out.println(socket.getInetAddress()+"����");
			    out = new PrintWriter(socket.getOutputStream());
				out.println("�氡�氡");
				}finally {
					if(out!=null);
					out.close();
					if(socket!=null);
					socket.close();
				}
			}
		}finally {
			if(serverSocket!=null) {
				serverSocket.close();				
			}
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
