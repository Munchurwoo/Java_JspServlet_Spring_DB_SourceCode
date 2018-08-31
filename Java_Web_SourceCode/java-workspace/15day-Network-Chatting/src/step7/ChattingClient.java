package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import step4.IP;

/*
 * ChattingClient 
 * 	: ReceiverWorker Thread ���� �� start 
 * 	: �ֿܼ��� �Է¹޾� ������ ����ϴ� ���� 
 * ReceiverWorker 
 * 	: �������� ���޵Ǵ� �޼����� �Է¹޴� ���� 
 */
public class ChattingClient {
	private Socket socket;
	private Scanner scanner;
	private PrintWriter pw;
	private BufferedReader br;
	public void go() throws UnknownHostException, IOException {
		try {
		socket = new Socket(IP.INST, 5432);
		System.out.println("**ä�� Ŭ���̾�Ʈ**");
		ReceiverWorker worker = new ReceiverWorker();
		Thread thread = new Thread(worker);
		//�ڽ�(ReceverWorker Thread)�� �����Ų �����尡 
		//����Ǹ� �Բ� ����ǵ��� ���� 
		thread.setDaemon(true);
		thread.start();
		//������ �ڽ��� �޼����� ����ϴ� ����� ���� 
		scanner = new Scanner(System.in);
		pw=new PrintWriter(socket.getOutputStream(),true);
		while(true) {
			String message = scanner.nextLine();
			pw.println(message);
			if(message.equals("����"))
				break;
		}
		}finally {
			closeAll();
			System.out.println("ä�� ����");
		}
	}
	public void closeAll() throws IOException {
		if(br!=null)
			br.close();
		if(pw!=null)
			pw.close();
		if(scanner!=null)
			scanner.close();
		if(socket!=null)
			socket.close();
	}
	public static void main(String[] args) {
		try {
			new ChattingClient().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class ReceiverWorker implements Runnable{
		public void receive() throws IOException {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String message = br.readLine();
				if(message==null)
					break;
				System.out.println(message);
			}
		}
		@Override
		public void run() {
			try {
				receive();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
