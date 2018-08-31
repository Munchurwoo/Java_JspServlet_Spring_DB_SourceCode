package network.step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*	서버와 클라이언트 1 대 1 지속적인 통신 
 *  
 *  서버는 클라이언트 접속을 대기하다 
 *  클라이언트가 접속하여 메세지를 보내면 
 *  그 메세지를 입력받아 자신의 콘솔에 출력하고
 *  그 메세지를 다시 클라이언트에게 전송한다 
 *  
 *  클라이언트가 종료 라는 메세지를 전송하면 
 *  입력받아 서버도 종료되도록 한다 
 *  
 *  ServerSocket
 *  accept() : Socket
 *  BufferedReader>InputStreamReader>socket.getInputStream()
 *  PrintWriter>socket.getOutputStream() 
 *  입력 후 출력 
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
			System.out.println(socket.getInetAddress()+"님이 접속");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush
			while(true) {
				String message=br.readLine();
				if(message.equals("종료")) {
					System.out.println("**client 종료했으므로 server도 종료**");
					break;
				}
				System.out.println(socket.getInetAddress()+"님 메세지:"+message);
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




















