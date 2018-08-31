package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/* 1 �� �� ������ �޾Ƹ� ���� 
 *  �ټ��� Ŭ���̾�Ʈ�� ���������� 
 *  �޾Ƹ� ���񽺸� �޵��� 
 *  MultiServer �� ��Ƽ�������� �̿��� ����
 * 
 */
public class MultiServer {
	/*
	 * ServerSocket while(true){ accept() : Socket ServerWorker ����( ������ ���� �Ҵ� )
	 * ServerWorker�� �̿��� ������ ���� , start }
	 * 
	 */
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			while (true) { // �ټ��� Ŭ���̾�Ʈ�� �����ϱ� ���� �ݺ�
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
	 * ���� Ŭ���̾�Ʈ���� �޾Ƹ� �����ϴ� ������
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
			System.out.println("[" + clientIp + "]�� ����");
			while (true) {
				String message = br.readLine();
				if (message == null || message.equals("null") || message.equals("����")) {
					System.out.println("[" + clientIp + "]�� ����");
					break;
				}
				System.out.println("[" + clientIp + "]�� �޼���:" + message);
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