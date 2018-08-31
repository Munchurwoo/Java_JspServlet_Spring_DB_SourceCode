
/*
 * 서버가 대기하다
 * 클라이언트 접속하면 
 * 클라이언트가 보낸 매세지를 입력받아
 * 자신의 콘솔에 
 * 192. : 님의 메세지 : 오빠 안녕? 
 * 출력하고 다시 클라이언트 접속을 대기한다. 
 */
package network.step2;

/*
 * 클라이언트는 서버에 접속하여 
 * 자신에 메세지를 출력한 후 
 * 종료한다. 
 * *** 클라이언트가 서버에 접속**
 * ** 메세지 전송 후 종료 **
 */
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
 
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import network.step1.TestServer1;

public class TestServer2 {
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





