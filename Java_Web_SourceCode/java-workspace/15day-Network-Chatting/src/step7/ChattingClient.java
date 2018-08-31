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
 * 	: ReceiverWorker Thread 생성 후 start 
 * 	: 콘솔에서 입력받아 서버로 출력하는 역할 
 * ReceiverWorker 
 * 	: 서버에서 전달되는 메세지를 입력받는 역할 
 */
public class ChattingClient {
	private Socket socket;
	private Scanner scanner;
	private PrintWriter pw;
	private BufferedReader br;
	public void go() throws UnknownHostException, IOException {
		try {
		socket = new Socket(IP.INST, 5432);
		System.out.println("**채팅 클라이언트**");
		ReceiverWorker worker = new ReceiverWorker();
		Thread thread = new Thread(worker);
		//자신(ReceverWorker Thread)을 실행시킨 스레드가 
		//종료되면 함께 종료되도록 설정 
		thread.setDaemon(true);
		thread.start();
		//서버로 자신의 메세지를 출력하는 기능을 정의 
		scanner = new Scanner(System.in);
		pw=new PrintWriter(socket.getOutputStream(),true);
		while(true) {
			String message = scanner.nextLine();
			pw.println(message);
			if(message.equals("종료"))
				break;
		}
		}finally {
			closeAll();
			System.out.println("채팅 종료");
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
