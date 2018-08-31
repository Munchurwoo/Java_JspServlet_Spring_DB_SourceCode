package network.step2.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 서버는 클라이언트의 메세지를 입력받아 자신의 콘솔에 출력한다
public class NetServer2 {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**NetServer2 실행**");
			while(true) {
			//서버소켓(대표전화)은 클라이언트의 접속을 대기하다가
			//접속하면 클라이언트와 통신하기 위한 
			//일반소켓(콜센터직원전화기)을 생성해 반환해준다 
			Socket socket=null;
			BufferedReader br=null;
			try {	
			socket=serverSocket.accept();
			//클라이언트가 전송한 데이터를 입력받기 위한 스트림생성
			br=new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
			//전송한 데이터를 입력받아 콘솔에 출력한다 
			String message=br.readLine();
			System.out.println(
					socket.getInetAddress()+"님의 말:"+message);
			}catch(Exception e) {
				System.out.println("**client와 통신예외발생**");
				e.printStackTrace();
			}finally {
				if(br!=null)
					br.close();
				if(socket!=null)
					socket.close();
			}//finally
			}//while
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new NetServer2().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





