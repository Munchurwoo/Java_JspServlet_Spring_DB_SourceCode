package step4;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args){
        try {
            ServerSocket server = new ServerSocket(5432);
            System.out.println("접속을 기다립니다.");
            while(true){
                Socket socket = server.accept();
                EchoThread ethr = new EchoThread(socket);
                ethr.start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class EchoThread extends Thread{
    private Socket sock;
    public EchoThread(Socket socke){
        this.sock = socke;
    }
    public void run(){
        try{
            InetAddress inetAddr = sock.getInetAddress();
            System.out.println(inetAddr.getHostAddress() + "로 부터 접속했습니다.");
            OutputStream out = sock.getOutputStream();
            InputStream in = sock.getInputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(inetAddr.getHostName()+"으로 부터 전송받은 문자열 : "+line);
                if(line.equals("종료")){
                	System.out.println(inetAddr.getHostName()+"퇴장");
                	break;
                }
                pw.println(line);
                pw.flush();
            }
            if(pw!=null)
            	pw.close();
            if(br!=null)
            	br.close();
            sock.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}