package network.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * 서버와 클라이언트 1대 1 지속적인 통신 
 * 서버는 클라이언트 접속을 대기하다. 
 * 클라이언트가 접속하여 메세지를 보내면 
 * 그 메세지를 입력받아 자신의 콘솔에 출력하고 그 메세지를 클라이언트에게 출력한다. 
 * 
 * 클라이언트가 종료라는 메세지를 전송하면 
 * 입력받아 서버도 종료 되도록한다.
 * 
 *  ServerSocket 
 *  accept(): Socket 
 *  클라이언트 메세지 입력받는 BufferedReader 
 *  PrintWriter > socket.getOutPutStream();
 *  입력 후 출력 
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scan = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(5432);
			socket = serverSocket.accept();
			while (true) {
				try {
					scan = new Scanner(System.in);
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String message = br.readLine();
					System.out.println(socket.getInetAddress() + "님: " + message);
					System.out.println("서버님 대화 대기중");
					pw = new PrintWriter(socket.getOutputStream(),true);
					pw.println(scan.nextLine());
					if (message.equals("종료")) {
						break;
					}
				} finally {
					if (scan != null)
						scan.close();
					if (br != null)
						br.close();
					if (pw != null)
						pw.close();
				}
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
			
			if (socket != null)
				socket.close();
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
