package step5;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * ä�� Ŭ���̾�Ʈ 
 * 
 * ä�� ������ �����ؼ� 
 * ������ ģ������ �޼����� �Է¹ް�
 * (���� ������ : ReceiverWorker Thread)  
 * �ڽ��� �޼����� ����ϴ� ���α׷� 
 * (�۽� ������ : main Thread )
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
