package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattingServer {
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go() throws IOException {
		ServerSocket serverSocket =null; 
		try {
			serverSocket = new ServerSocket(5432);
			Socket socket = serverSocket.accept();
			ServerWorker serverWorker = new ServerWorker(socket);
			Thread thread = new Thread(serverWorker);
			thread.start();
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	//접속한 전체 클라이언트에 메세지를 전달하는 메서드 
	public void broadcast(String message) {
		//list.get(0).
	}
	public static void main(String[] args) {
		try {
			new ChattingServer().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 실제 클라이언트와 대화하는 ServerWorker runnable 객체 스레드 
	class ServerWorker implements Runnable{
		private Socket socket ;
		private BufferedReader br;
		private PrintWriter pw;
		private String clientIp;
		public ServerWorker(Socket socket) {
			this.socket = socket;
			clientIp = "["+socket.getInetAddress().toString()+"]님";
		}
		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					closeAll();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void chatting() throws IOException {

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
		
		}
		public void closeAll() throws IOException {
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
		}
	}
	
}
