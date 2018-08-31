package step7;

public interface CommonInfo {
	//interface이므로 public static final 이 자동 삽입
	// mp3 와 avi 파일을 생성하는 디렉토리 
	String MAKE_PATH="C:\\java-kosta\\test\\repository";
	//mp3 파일이 이동되어 저장되는 디렉토리 
	String MUSIC_PATH="C:\\java-kosta\\test\\music";
	//avi 파일이 이동되어 저장되는 디렉토리 
	String MOVIE_PATH="C:\\java-kosta\\test\\movie";
	//생성한 파일 최종 번호가 저장된 파일 경로 
	String SAVE_LAST_NUM_PATH="C:\\java-kosta\\test\\last_number.txt";
}








