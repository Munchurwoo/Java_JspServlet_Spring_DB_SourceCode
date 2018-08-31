package step6;
import java.net.*;
import java.io.*;

public class ChatClient {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("���� : java ChatClient id ������ ���� ip");
            System.exit(1);
        }

        Socket sock = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        boolean endflag = false;
        try{
            sock = new Socket(args[1], 5432);
            pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            pw.println(args[0]);
            pw.flush();

            InputThread it = new InputThread(sock, br);
            it.start();
            String line = null;
            while((line = keyboard.readLine()) != null){
                pw.println(line);
                pw.flush();
                if(line.equals("/quit")){
                    endflag = true;
                    break;
                }
            }
            System.out.println("Ŭ���̾�Ʈ�� ������ �����մϴ�.");
        }catch(Exception ex) {
            if(!endflag){
                System.out.println(ex);
            }
        }finally{
            try{
                if(pw != null) pw.close();
            }catch(Exception ex){}
            try{
                if(br != null) br.close();
            }catch(Exception ex){}
            try{
                if(sock != null) sock.close();
            }catch(Exception ex){}
        }
    }
}

class InputThread extends Thread {
    private Socket sock = null;
    private BufferedReader br = null;
    public InputThread(Socket sock, BufferedReader br){
        this.sock = sock;
        this.br = br;
    }

    public void run() {
        try{
            String line = null;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch(Exception ex){
        }finally{
            try{
                if(br != null) br.close();
            }catch(Exception ex) {}
            try{
                if(sock != null) sock.close();
            }catch(Exception ex) {}
        }
    }
}