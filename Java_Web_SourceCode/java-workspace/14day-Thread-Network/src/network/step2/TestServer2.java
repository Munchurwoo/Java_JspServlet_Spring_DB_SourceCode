
/*
 * ������ ����ϴ�
 * Ŭ���̾�Ʈ �����ϸ� 
 * Ŭ���̾�Ʈ�� ���� �ż����� �Է¹޾�
 * �ڽ��� �ֿܼ� 
 * 192. : ���� �޼��� : ���� �ȳ�? 
 * ����ϰ� �ٽ� Ŭ���̾�Ʈ ������ ����Ѵ�. 
 */
package network.step2;

/*
 * Ŭ���̾�Ʈ�� ������ �����Ͽ� 
 * �ڽſ� �޼����� ����� �� 
 * �����Ѵ�. 
 * *** Ŭ���̾�Ʈ�� ������ ����**
 * ** �޼��� ���� �� ���� **
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





