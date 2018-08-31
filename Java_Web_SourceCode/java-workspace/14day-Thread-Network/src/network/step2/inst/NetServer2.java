package network.step2.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//������ Ŭ���̾�Ʈ�� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����Ѵ�. 
public class NetServer2 {
	public void go() throws IOException {
		ServerSocket serverSoket = null;
		try {
			serverSoket = new ServerSocket(5432);
			System.out.println("NetServer2 ����");
			// �������� Ŭ���̾�Ʈ�� ������ ��ٸ���.
			while (true) {
				Socket socket =null;
				BufferedReader br = null;
				try {
				//���� ����(��ǥ��ȭ)�� Ŭ���̾�Ʈ ������ ����ϴٰ� 
				//�����ϸ� Ŭ���̾�Ʈ�� ����ϱ� ���� �Ϲݼ���(�����)
				socket = serverSoket.accept();
				//Ŭ���̾�Ʈ�� ���� �����͸� �Է¹ޱ� ���� ��Ʈ�� ���� 
				//InputStreamReader 2����Ʈ�� ��ȯ 
				br = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				//������ �����͸� �Է¹޾� �ֿܼ� ����Ѵ�. 
				String message = br.readLine();
				System.out.println(socket.getInetAddress()+"���� ��:"+message);
				}catch(Exception e) {
					System.out.println("**client�� ��ſ��� �߻�**");
					e.printStackTrace();
				}
				finally {
					if(br!=null)
						br.close();
					if(socket!=null)
						socket.close();
				}
			}
		} finally {
			if (serverSoket != null) {
				serverSoket.close();
			}
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
