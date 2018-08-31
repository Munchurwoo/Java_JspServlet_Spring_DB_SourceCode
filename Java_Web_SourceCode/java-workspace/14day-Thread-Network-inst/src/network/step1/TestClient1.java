package network.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient1 {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null;
		BufferedReader br=null;
		try {
			socket=new Socket("127.0.0.1",5432);
			System.out.println("**client가 서버에 접속**");
			InputStream is=socket.getInputStream();
			//1byte단위 Stream을 2byte단위 Stream으로 변환하는 스트림
			InputStreamReader ir=new InputStreamReader(is);
			br=new BufferedReader(ir);
			//서버가 출력한 데이터를 입력받는다 
			String data=br.readLine();
			System.out.println("서버에서 보낸 메세지:"+data);						
		}finally {
			if(br!=null)
				br.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new TestClient1().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



