package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*  ChattingServer (main thread) 
 *   : ���� ������ 
 *    �ֿ� ���� - Ŭ���̾�Ʈ ������ ����ϴ� 
 *        �����ϸ� Ŭ���̾�Ʈ�� ����ϱ� ���� ������ 
 *        ���� , ServerWorker ������ �����Ҵ� 
 *        ServerWorker�� �̿��� ������ ���� �� start 
 *           ServerWorker ��ü�� �ּҰ��� �����ϴ� 
 *        list�� add() - ���� ä�ø޼����� ������ ��ü
 *        Ŭ���̾�Ʈ�� �����ϱ� ���� 
 *   ServerWorker 
 *   : ���� ������ 
 *    ���� Ŭ���̾�Ʈ�� ���(ä�ü���)�ϴ� Ŭ���� 
 *    Ŭ���̾�Ʈ�� �޼����� �����ϸ� �Է¹޾� 
 *    ChattingServer�� list�� ����� ��� ServerWorker �� �̿���
 *    ������ Ŭ���̾�Ʈ�鿡�� �޼����� ����Ѵ� 
 */
public class ChattingServer {
	/*
	 * �ټ��� ������(ServerWorker)�� ���� �Ʒ� list�� 
	 * �����Ǵ� �ڿ��̴�. 
	 * ArrayList �� thread- safe ���� �����Ƿ� ( ����ȭó���� �Ǿ� ���� �ʴ�. ) 
	 * ������ ����ȭ ó���� �ʿ��ϴ�. 
	 * ���� : synchronized ó�� (����ȭ ó��)
	 * �� �Ǹ� �����ڿ��� ���� Ư�� �����尡 ����� �� 
	 * �ٸ� ������� ����ϵ��� ó���ϴ� ���� ���Ѵ�.
	 */
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**ä�ü���**");
			// ����ϴ� Ŭ���̾�Ʈ �����ϸ� ����
			// �������� Ŭ���̾�Ʈ�� ����ϱ� ���� Socket�� ����
			while (true) {
				Socket socket = serverSocket.accept();
				// ������ ��ȭ�⸦ �ʿ��ϹǷ�
				ServerWorker serverWorker = new ServerWorker(socket);
				Thread thread = new Thread(serverWorker);
				list.add(serverWorker);
				System.out.println(socket.getInetAddress() + "�� ����!");
				thread.start();
			} // while
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}// go method
		// �������� ��� Ŭ���̾�Ʈ���� �޼����� �����ϴ� �޼���

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

	// ���� Ŭ���̾�Ʈ�� ����ϴ� Ŭ����
	class ServerWorker implements Runnable {
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;
		private String clientIp;

		ServerWorker(Socket socket) {
			this.socket = socket;
			this.clientIp = socket.getInetAddress().toString() + "�� ";
		}

		public void chatting() throws IOException {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);// autoflush
			broadcast(clientIp + " ����");// ��� Ŭ���̾�Ʈ�鿡 ������ �˸���
			while (true) {
				String message = br.readLine();// Ŭ���̾�Ʈ �޼����� �Է¹޴´�
				if (message == null || message.equals("null") || message.equals("����")) {
					break;// while �� ����, ������ ����(== ä������ )
				}
				broadcast(clientIp + ":" + message);// �޼����� ��ü Ŭ���̾�Ʈ���� ����
			} // while
		}// chatting method

		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				System.out.println(clientIp + " ��������!");
				e.printStackTrace();
			} finally {
				broadcast(clientIp + " ����!");// client���� �޼���
				System.out.println(clientIp + " ����!");// ���� �ֿܼ� �޼���
				list.remove(this);// ����Ʈ���� �ڽ��� �����Ѵ�
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
