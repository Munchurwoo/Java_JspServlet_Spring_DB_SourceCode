package step5;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * 채팅 클라이언트 
 * 
 * 채팅 서버에 접속해서 
 * 접속한 친구들의 메세지를 입력받고
 * (수신 스레드 : ReceiverWorker Thread)  
 * 자신의 메세지를 출력하는 프로그램 
 * (송신 스레드 : main Thread )
 */
public class ChattingClient {
	private Socket socket;
	private Scanner scanner;
	private PrintWriter pw;
	private BufferedReader br;
	public void go() {}
	public static void main(String[] args) {
		
	}
	class ReceiverWorkver implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
