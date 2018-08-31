package network.step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import network.IP;

/*	클라이언트와 서버의 1 대 1 지속적인 통신 
 * 
 *  클라이언트는 서버에 접속하여 
 *  콘솔에서 입력받은 메세지를 출력하고 
 *  서버가 보낸 메세지를 입력받아 자신의 콘솔에 지속적으로
 *  출력하는 일을 한다 
 *  통신을 종료하고자 할 때는 콘솔에 종료라는 메세지를
 *  입력하면 서버와 클라이언트 통신이 종료되도록 
 *  구현한다 
 *  
 *   Socket(ip,port)  
 *   Scanner > System.in 
 *   PrintWriter > socket.getOutputStream() 
 *   BufferedReader > InputStreamReader > socket.getInputStream() 
 *   콘솔에서 입력받아 서버에 출력 
 *   서버가 보낸 메세지를 입력받아 콘솔에 출력 
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
				if(message.equals("종료")) {
					System.out.println("그만 하자~~종료~~");
					break;
				}
				System.out.println("서버가 보낸 메세지:"+br.readLine());
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













