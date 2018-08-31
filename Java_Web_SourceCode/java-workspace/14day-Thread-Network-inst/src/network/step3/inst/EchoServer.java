package network.step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*	������ Ŭ���̾�Ʈ 1 �� 1 �������� ��� 
 *  
 *  ������ Ŭ���̾�Ʈ ������ ����ϴ� 
 *  Ŭ���̾�Ʈ�� �����Ͽ� �޼����� ������ 
 *  �� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����ϰ�
 *  �� �޼����� �ٽ� Ŭ���̾�Ʈ���� �����Ѵ� 
 *  
 *  Ŭ���̾�Ʈ�� ���� ��� �޼����� �����ϸ� 
 *  �Է¹޾� ������ ����ǵ��� �Ѵ� 
 *  
 *  ServerSocket
 *  accept() : Socket
 *  BufferedReader>InputStreamReader>socket.getInputStream()
 *  PrintWriter>socket.getOutputStream() 
 *  �Է� �� ��� 
 *  close 
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		Socket socket=null;
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**EchoServer**");
			socket=serverSocket.accept();
			System.out.println(socket.getInetAddress()+"���� ����");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush
			while(true) {
				String message=br.readLine();
				if(message.equals("����")) {
					System.out.println("**client ���������Ƿ� server�� ����**");
					break;
				}
				System.out.println(socket.getInetAddress()+"�� �޼���:"+message);
				pw.println(message);
			}
		}finally {
			if(pw!=null)
				pw.close();
			if(br!=null)
				br.close();
			if(socket!=null)
				socket.close();
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




















