package step7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*
 * 1�� �������� 30���� ������ �����Ѵ� 
 * Ȯ���ڴ� .avi or mp3�� �ϵ� Random class�� nextBoolean() �� �̿��Ѵ� 
 */
public class MakeFileWorker implements Runnable{
	private int period;
	private int count;
	
	public MakeFileWorker(int period, int count) {
		this.period=period;
		this.count=count;
	}
	/*
	 * MakeFileWorker ������ ���� period �ð����� count ��ŭ�� ������ ������ ���丮�� ����
	 *  0. ���� ���丮  ���� 
	 *  1. Random �� �̿��ؼ� Ȯ���ڸ� .mp3 or .avi �� �ش�  
	 *  2. for ���� �̿��� count ��ŭ 	 * �ݺ��Ͽ� 
	 *     ������ �����ϵ� period �������� sleep �� �� ������ �簳�Ѵ�
	 * 
	 */
	// ���ϸ� Ȯ���ڸ� �ο��ϴ� �޼���
	public String createFileName(int name) {
		Random r = new Random();
		if (r.nextBoolean())
			return name + ".mp3";
		else
			return name + ".avi";
	}
	public void run() {
		try {
			new File(CommonInfo.MAKE_PATH).mkdir();
			int num=loadLastNumber();
			int i;
			for (i=num ; i<num+count; i++) {
				String fileName = createFileName(i);
				new File(CommonInfo.MAKE_PATH
						+ File.separator + fileName).createNewFile();
				System.out.println(fileName + " ����");
				Thread.sleep(period);				
			} // for
			saveLastNumber(i);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void saveLastNumber(int num) throws IOException {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(CommonInfo.SAVE_LAST_NUM_PATH));
			pw.println(num);
		} finally {
			if (pw != null)
				pw.close();
		}
	}

	public int loadLastNumber() throws NumberFormatException, IOException {
		int lastNumber = 0;
		File file = new File(CommonInfo.SAVE_LAST_NUM_PATH);
		new File("C:\\java-kosta\\test\\hi.txt").createNewFile();
		if (file.isFile()) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
				if(br.ready())
				lastNumber = Integer.parseInt(br.readLine());
			} finally {
				if (br != null)
					br.close();
			}
		}
		return lastNumber;
	}
}
