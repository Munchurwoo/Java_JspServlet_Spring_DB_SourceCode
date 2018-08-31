package network.step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer1 {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			int port=5432;
			serverSocket=new ServerSocket(port);
			System.out.println("**서버**");
			 //지속적으로 클라이언트에 서비스하기 위해
			// 클라이언트 한명 접속할 때마다 while문 한번 실행된다 
			while(true) {
			//accept : 대기하다 클라이언트 접속하면 실행
			Socket socket=null;
			PrintWriter out=null;
			try {
			socket=serverSocket.accept();
			System.out.println(socket.getInetAddress()+" client 접속");
			out=new PrintWriter(socket.getOutputStream());
			out.println("방가방가");
			}finally {
				if(out!=null)
				out.close();
				if(socket!=null)
				socket.close();
			}
			}//while
		}finally {
			if(serverSocket!=null)
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






