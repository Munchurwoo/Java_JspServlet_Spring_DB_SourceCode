package step10;

import java.io.File;

/*		File 삭제 및 이동 테스트 
 * 
 */
public class TestFile6 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\media\\music\\북극성.mp3";
		//삭제테스트 delete()
		File f=new File(path);
		boolean flag=f.delete();
		System.out.println(f.getName()+" delete "+flag);
		//이동테스트 renameTo()
		String orgPath="C:\\java-kosta\\test\\media\\music\\뚜두뚜두.mp3";
		String destPath="C:\\java-kosta\\test\\alsongplayer\\뚜두뚜두.mp3";
		//디렉토리 생성 
		File destDir=new File(destPath).getParentFile();
		destDir.mkdirs();
		System.out.println("목적지 디렉토리 생성");
		File orgFile=new File(orgPath);
		boolean moveFlag=orgFile.renameTo(new File(destPath));
		System.out.println("파일 이동 "+moveFlag);
	}
}







