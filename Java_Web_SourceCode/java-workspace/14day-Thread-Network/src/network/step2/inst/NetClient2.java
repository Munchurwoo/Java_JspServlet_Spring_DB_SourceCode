package network.step2.inst;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import network.step2.IP;

//������ �����ؼ� �޼����� ����ϴ� Ŭ���̾�Ʈ 
public class NetClient2 {
	public void go() throws UnknownHostException, IOException {
		Socket socket =null;
		PrintWriter pw = null;
		Scanner scan= null;
		
		
		try {
			socket = new Socket(IP.LOCAL, 5432);
			System.out.println("client�� server�� ����");
			pw = new PrintWriter(socket.getOutputStream());
			System.out.println("�޼����� �Է��ϼ���.");
			scan = new Scanner(System.in);
			while(true) {
				String a = scan.nextLine();
				pw.println(a);
			}
			
		}finally {
			if(pw!=null)
				pw.close();
			if(socket!=null)
				socket.close();
			if(scan!=null)
				scan.close();
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
