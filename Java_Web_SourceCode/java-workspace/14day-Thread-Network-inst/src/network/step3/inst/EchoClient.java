package network.step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import network.IP;

/*	Ŭ���̾�Ʈ�� ������ 1 �� 1 �������� ��� 
 * 
 *  Ŭ���̾�Ʈ�� ������ �����Ͽ� 
 *  �ֿܼ��� �Է¹��� �޼����� ����ϰ� 
 *  ������ ���� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����������
 *  ����ϴ� ���� �Ѵ� 
 *  ����� �����ϰ��� �� ���� �ֿܼ� ������ �޼�����
 *  �Է��ϸ� ������ Ŭ���̾�Ʈ ����� ����ǵ��� 
 *  �����Ѵ� 
 *  
 *   Socket(ip,port)  
 *   Scanner > System.in 
 *   PrintWriter > socket.getOutputStream() 
 *   BufferedReader > InputStreamReader > socket.getInputStream() 
 *   �ֿܼ��� �Է¹޾� ������ ��� 
 *   ������ ���� �޼����� �Է¹޾� �ֿܼ� ��� 
 *   close 
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null;
		Scanner scanner=null;
		PrintWriter pw=null;
		BufferedReader br=null;
		try {
			socket=new Socket(IP.LOCAL,5432);
			System.out.println("**EchoClient**");
			scanner=new Scanner(System.in);
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush
			br=new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			while(true) {
				String message=scanner.nextLine();
				pw.println(message);
				if(message.equals("����")) {
					System.out.println("�׸� ����~~����~~");
					break;
				}
				System.out.println("������ ���� �޼���:"+br.readLine());
			}
		}finally {
			if(br!=null)
				br.close();
			if(pw!=null)
				pw.close();
			if(scanner!=null)
				scanner.close();
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













