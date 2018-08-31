package step4;
class MusicService{
	/* Dance The Night Away
	 *  Dejavu
	 *  뚜두뚜두
	 *  북극성
	 *  -->  .mp3 정보만 출력  , 확장자는 제외하고 곡명만 출력 
	 */
	public void printMusicInfo(String musicInfo) {
		String ext=".mp3";
		String [] music=musicInfo.split(",");
		for(int i=0;i<music.length;i++) {
			if(music[i].endsWith(ext)) { 
				// replaceAll () : 기존 문자열을 변경 
				//System.out.println(music[i].replaceAll(ext,""));
				int index=music[i].lastIndexOf(".");
				System.out.println(music[i].substring(0, index));
			}//if
		}//for
	}
}
public class TestString2 {
	public static void main(String[] args) {
		String musicInfo
		="Dance The Night Away.mp3,Dejavu.mp3,뚜두뚜두.mp3,라디오스타.avi,북극성.mp3";
		MusicService service=new MusicService();
		service.printMusicInfo(musicInfo);
	}
}
