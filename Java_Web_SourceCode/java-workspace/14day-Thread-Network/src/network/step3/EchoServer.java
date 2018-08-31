package network.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * ������ Ŭ���̾�Ʈ 1�� 1 �������� ��� 
 * ������ Ŭ���̾�Ʈ ������ ����ϴ�. 
 * Ŭ���̾�Ʈ�� �����Ͽ� �޼����� ������ 
 * �� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����ϰ� �� �޼����� Ŭ���̾�Ʈ���� ����Ѵ�. 
 * 
 * Ŭ���̾�Ʈ�� ������ �޼����� �����ϸ� 
 * �Է¹޾� ������ ���� �ǵ����Ѵ�.
 * 
 *  ServerSocket 
 *  accept(): Socket 
 *  Ŭ���̾�Ʈ �޼��� �Է¹޴� BufferedReader 
 *  PrintWriter > socket.getOutPutStream();
 *  �Է� �� ��� 
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
					System.out.println(socket.getInetAddress() + "��: " + message);
					System.out.println("������ ��ȭ �����");
					pw = new PrintWriter(socket.getOutputStream(),true);
					pw.println(scan.nextLine());
					if (message.equals("����")) {
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
