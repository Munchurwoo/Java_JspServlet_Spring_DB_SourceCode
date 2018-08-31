package network.step2.inst;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import network.IP;

// 서버에 접속해서 메세지를 출력하는 클라이언트 
public class NetClient2 {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null;
		PrintWriter pw=null;
		Scanner scanner=null;
		try {
			socket=new Socket(IP.INST,5432);
			System.out.println("**client가 server에 접속**");
			//콘솔에서 입력받기 위한 스캐너 생성 
			scanner=new Scanner(System.in);
			//서버에 출력하기 위한 스트림 생성 
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








