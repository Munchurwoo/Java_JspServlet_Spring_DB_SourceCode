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
			System.out.println("**서버**");
			while(true) {
			Socket socket= null;
			PrintWriter out=null;
			try {
				socket = serverSocket.accept(); // 대기하다가 클라이언트 접속하면 실행 
				System.out.println(socket.getInetAddress()+"접속");
			    out = new PrintWriter(socket.getOutputStream());
				out.println("방가방가");
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
