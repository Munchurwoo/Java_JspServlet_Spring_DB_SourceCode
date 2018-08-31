package network.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 클라이언트와 서버의 1대1 지속적인 통신 
 * 
 * 클라이언트는 서버에 접속하여 메세지를  출력하고 
 * 콘솔에서 입력받은 메세지를 출력하고 
 * 서버가 보낸 메세지를 입력받아 자신의 콘솔에 지속적으로 출력하는 일을 한다. 
 * 통신을 종료하고자 할 대는 콘솔에 종료라는 메세지를 입력하면 
 * 서버와 클라이언트는 통신이 종료된다.
 * 
 * socket(ip,port) Scanner Syatem.in
 * printWriter > socket.getOutputStream() 
 * BufferedReader > InputStreamReader > socket.getInputStream();
 * 콘솔에서 입력받아 서버에 출력 
 * 서버가 보낸 메세지를 입력받아 콘솔에 출력 
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
			System.out.println("클라이언트가 서버에 접속 ");
			pw = new PrintWriter(socket.getOutputStream());
			scan = new Scanner(System.in);
			while(true) {
				try {
					String s =scan.nextLine(); 
					pw.println(s);
					System.out.println("나 :"+s);
					br = new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
					String data = br.readLine();
					System.out.println("서버: " + data);
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
