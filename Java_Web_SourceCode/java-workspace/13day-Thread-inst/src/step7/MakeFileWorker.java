package step7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*
 * 1초 간격으로 30개의 파일을 생성한다 
 * 확장자는 .avi or mp3로 하되 Random class의 nextBoolean() 을 이용한다 
 */
public class MakeFileWorker implements Runnable{
	private int period;
	private int count;
	
	public MakeFileWorker(int period, int count) {
		this.period=period;
		this.count=count;
	}
	/*
	 * MakeFileWorker 스레드 실행 period 시간동안 count 만큼의 파일을 지정한 디렉토리에 생성
	 *  0. 저장 디렉토리  생성 
	 *  1. Random 을 이용해서 확장자를 .mp3 or .avi 로 준다  
	 *  2. for 문을 이용해 count 만큼 	 * 반복하여 
	 *     파일을 생성하되 period 간격으로 sleep 한 후 실행을 재개한다
	 * 
	 */
	// 파일명에 확장자를 부여하는 메서드
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
				System.out.println(fileName + " 생성");
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
