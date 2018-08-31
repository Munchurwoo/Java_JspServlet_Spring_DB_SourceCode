package step5;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) {
		File dir=new File("C:\\java-kosta");
		System.out.println(dir.exists());//존재하면 true
		System.out.println(dir.isFile());//파일이면 true 
		System.out.println(dir.isDirectory());//디렉토리이면 true 
		//전체 경로명을 확인
		System.out.println(dir.getPath());
		// java-kosta의 하위 디렉토리 test 를 생성해본다 
		File dir2=new File(dir.getPath()+File.separator+"test");
		System.out.println(dir2.getPath());
		System.out.println(dir2.isDirectory());//생성전이므로 false 
		boolean flag=dir2.mkdirs(); //디렉토리(하위디렉토리까지) 생성 
		System.out.println("디렉토리 생성여부:"+flag);
		// java-kosta\\test 디렉토리 아래에 파일을 생성 
		File file=new File(dir2.getPath()+File.separator+"a.txt");
		// 해당 볼륨이 존재하지 않으므로 IOException 발생되어 throws 된다 
		//File file=new File("R:"+File.separator+"a.txt"); 
		System.out.println(file.getPath());
		System.out.println(file.isFile());
		try {
			boolean fileFlag=file.createNewFile();
			System.out.println(file.getName()+" 파일을 생성 "+fileFlag);
		} catch (IOException e) {		
			e.printStackTrace();
		}
		// 방금 생성한 file 을 보유한 디렉토리를 알고 싶다 
		String parentName=file.getParent();
		System.out.println(parentName);
		// 상위 디렉토리 정보를 String 이 아니라 File 객체로 반환받는다 
		File parentFile=file.getParentFile();
		System.out.println(parentFile.getPath());
		System.out.println(parentFile.isDirectory());
		//a.txt 와 같은 위치에 있는 파일명을 모두 출력하세요 
		File list[]=parentFile.listFiles();
		for(int i=0;i<list.length;i++) {
			if(list[i].isFile()) {
				System.out.println(list[i].getName());
			}
		}			
	}
}













