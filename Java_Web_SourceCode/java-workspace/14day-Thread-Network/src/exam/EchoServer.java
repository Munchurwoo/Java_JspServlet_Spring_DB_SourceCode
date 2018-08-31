package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("EchoServer 실행 ");
			//서버 소켓의 정보를 소켓 객체로 받음
			socket= serverSocket.accept();
			System.out.println(socket.getInetAddress()+"님이 접속");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true);

			while(true) {
				String message =br.readLine();
				if(message.equals("종료")) {
					System.out.println("클라이언트 종료 했으므로 server도 종료");
					break;
				}
				System.out.println(socket.getInetAddress()+"님 메세지 :"+message);
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
