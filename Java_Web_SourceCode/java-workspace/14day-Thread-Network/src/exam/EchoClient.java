package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import network.step2.IP;

public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		Scanner scan = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket(IP.LOCAL,5432);
			scan = new Scanner(System.in);
			pw=new PrintWriter(socket.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String message = scan.nextLine();
				pw.println(message);
				if(message.equals("종료")) {
					System.out.println("종료");
					break;
				}
				System.out.println("서버가 보낸 메세지 : "+br.readLine());
			}
			
			
		}finally {
			if (br != null)
				br.close();
			if (pw != null)
				pw.close();
			if (scan != null)
				scan.close();
			if (socket != null)
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
