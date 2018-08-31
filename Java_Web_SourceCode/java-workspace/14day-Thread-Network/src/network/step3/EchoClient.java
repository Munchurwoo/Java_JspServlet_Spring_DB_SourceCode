package network.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * Ŭ���̾�Ʈ�� ������ 1��1 �������� ��� 
 * 
 * Ŭ���̾�Ʈ�� ������ �����Ͽ� �޼�����  ����ϰ� 
 * �ֿܼ��� �Է¹��� �޼����� ����ϰ� 
 * ������ ���� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ���������� ����ϴ� ���� �Ѵ�. 
 * ����� �����ϰ��� �� ��� �ֿܼ� ������ �޼����� �Է��ϸ� 
 * ������ Ŭ���̾�Ʈ�� ����� ����ȴ�.
 * 
 * socket(ip,port) Scanner Syatem.in
 * printWriter > socket.getOutputStream() 
 * BufferedReader > InputStreamReader > socket.getInputStream();
 * �ֿܼ��� �Է¹޾� ������ ��� 
 * ������ ���� �޼����� �Է¹޾� �ֿܼ� ��� 
 * 
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scan = null;
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1",5432);
			System.out.println("Ŭ���̾�Ʈ�� ������ ���� ");
			pw = new PrintWriter(socket.getOutputStream());
			scan = new Scanner(System.in);
			while(true) {
				try {
					String s =scan.nextLine(); 
					pw.println(s);
					System.out.println("�� :"+s);
					br = new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
					String data = br.readLine();
					System.out.println("����: " + data);
				}finally {
					if (br != null)
						br.close();
					if (pw!=null) 
						pw.close();
				}
			}
					
		}finally {
			if (scan != null)
				scan.close();
			
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
