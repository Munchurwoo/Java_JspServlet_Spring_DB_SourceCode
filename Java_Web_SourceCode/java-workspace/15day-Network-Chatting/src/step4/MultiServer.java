package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/* 1 대 다 지속적 메아리 서비스 
 *  다수의 클라이언트가 지속적으로 
 *  메아리 서비스를 받도록 
 *  MultiServer 는 멀티스레딩을 이용해 구현
 * 
 */
public class MultiServer {
	/*
	 * ServerSocket while(true){ accept() : Socket ServerWorker 생성( 생성시 소켓 할당 )
	 * ServerWorker를 이용한 스레스 생성 , start }
	 * 
	 */
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			while (true) { // 다수의 클라이언트와 접속하기 위해 반복
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				Thread thread = new Thread(serverWorker);
				thread.start();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 실제 클라이언트에게 메아리 서비스하는 스레드
	 * 
	 */
	class ServerWorker implements Runnable {
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;
		private String clientIp;

		ServerWorker(Socket socket) {
			this.socket = socket;
			this.clientIp = socket.getInetAddress().toString();
		}

		@Override
		public void run() {
			try {
				echo();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					closeAll();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		public void echo() throws IOException {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);// true : autoflush
			System.out.println("[" + clientIp + "]님 입장");
			while (true) {
				String message = br.readLine();
				if (message == null || message.equals("null") || message.equals("종료")) {
					System.out.println("[" + clientIp + "]님 퇴장");
					break;
				}
				System.out.println("[" + clientIp + "]님 메세지:" + message);
				pw.println(message + " server~");
			} // while
		}// echo

		public void closeAll() throws IOException {
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
		}
	}// inner class
}// outer class