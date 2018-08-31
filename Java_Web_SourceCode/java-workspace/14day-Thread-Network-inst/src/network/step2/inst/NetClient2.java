package network.step2.inst;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import network.IP;

// ������ �����ؼ� �޼����� ����ϴ� Ŭ���̾�Ʈ 
public class NetClient2 {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null;
		PrintWriter pw=null;
		Scanner scanner=null;
		try {
			socket=new Socket(IP.INST,5432);
			System.out.println("**client�� server�� ����**");
			//�ֿܼ��� �Է¹ޱ� ���� ��ĳ�� ���� 
			scanner=new Scanner(System.in);
			//������ ����ϱ� ���� ��Ʈ�� ���� 
			pw=new PrintWriter(socket.getOutputStream());
			pw.println(scanner.nextLine());
		}finally {
			if(scanner!=null)
				scanner.close();  
			if(pw!=null)
				pw.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new NetClient2().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}








