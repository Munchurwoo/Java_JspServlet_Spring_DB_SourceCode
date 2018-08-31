package step11;

public class TestMoveFile {
	public static void main(String[] args) {
		String orgPath="C:\\java-kosta\\test\\media\\music";
		String destPath="C:\\java-kosta\\test\\mediaplayer";
		MoveFileService service=new MoveFileService();
		String ext=".mp3";
		//디렉토리와 다른 확장자 파일을 제외하고 ext 와 일치하는
		//확장자를 가진 파일들을 destPath 디렉토리로 모두 이동 
		service.moveAll(orgPath,destPath,ext);
		System.out.println("디렉토리 내 mp3파일을 모두 이동");
	}
}






