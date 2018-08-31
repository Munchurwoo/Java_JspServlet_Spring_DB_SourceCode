package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*  ChattingServer (main thread) 
 *   : 사장 스레드 
 *    주요 업무 - 클라이언트 접속을 대기하다 
 *        접속하면 클라이언트와 통신하기 위한 소켓을 
 *        생성 , ServerWorker 생성시 소켓할당 
 *        ServerWorker를 이용한 스레드 생성 및 start 
 *           ServerWorker 객체의 주소값을 저장하는 
 *        list에 add() - 이후 채팅메세지를 접속한 전체
 *        클라이언트에 전달하기 위해 
 *   ServerWorker 
 *   : 직원 스레드 
 *    실제 클라이언트와 통신(채팅서비스)하는 클래스 
 *    클라이언트가 메세지를 전달하면 입력받아 
 *    ChattingServer의 list에 저장된 모든 ServerWorker 를 이용해
 *    접속한 클라이언트들에게 메세지를 출력한다 
 */
public class ChattingServer {
	/*
	 * 다수의 스레드(ServerWorker)에 의해 아래 list는 
	 * 공유되는 자원이다. 
	 * ArrayList 는 thread- safe 하지 않으므로 ( 동기화처리가 되어 있지 않다. ) 
	 * 별도의 동기화 처리가 필요하다. 
	 * 복습 : synchronized 처리 (동기화 처리)
	 * 가 되면 공유자원에 대해 특정 스레드가 사용할 때 
	 * 다른 스레드는 대기하도록 처리하는 것을 말한다.
	 */
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**채팅서버**");
			// 대기하다 클라이언트 접속하면 실행
			// 실행결과로 클라이언트와 통신하기 위한 Socket을 리턴
			while (true) {
				Socket socket = serverSocket.accept();
				// 직원은 전화기를 필요하므로
				ServerWorker serverWorker = new ServerWorker(socket);
				Thread thread = new Thread(serverWorker);
				list.add(serverWorker);
				System.out.println(socket.getInetAddress() + "님 입장!");
				thread.start();
			} // while
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}// go method
		// 연결중인 모든 클라이언트에게 메세지를 전달하는 메서드

	public void broadcast(String message) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).pw.println(message);
		}
	}

	public static void main(String[] args) {
		try {
			new ChattingServer().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 실제 클라이언트와 통신하는 클래스
	class ServerWorker implements Runnable {
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;
		private String clientIp;

		ServerWorker(Socket socket) {
			this.socket = socket;
			this.clientIp = socket.getInetAddress().toString() + "님 ";
		}

		public void chatting() throws IOException {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);// autoflush
			broadcast(clientIp + " 입장");// 모든 클라이언트들에 입장을 알린다
			while (true) {
				String message = br.readLine();// 클라이언트 메세지를 입력받는다
				if (message == null || message.equals("null") || message.equals("종료")) {
					break;// while 문 종료, 스레드 종료(== 채팅종료 )
				}
				broadcast(clientIp + ":" + message);// 메세지를 전체 클라이언트에게 전달
			} // while
		}// chatting method

		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				System.out.println(clientIp + " 강제종료!");
				e.printStackTrace();
			} finally {
				broadcast(clientIp + " 나감!");// client에게 메세지
				System.out.println(clientIp + " 나감!");// 서버 콘솔에 메세지
				list.remove(this);// 리스트에서 자신을 삭제한다
				try {
					closeAll();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}// run

		public void closeAll() throws IOException {
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
		}
	}// ServerWorker inner class
}// ChattingServer class
