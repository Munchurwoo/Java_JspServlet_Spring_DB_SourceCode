package step4;
class MusicService{
	/* Dance The Night Away
	 *  Dejavu
	 *  �ѵζѵ�
	 *  �ϱؼ�
	 *  -->  .mp3 ������ ���  , Ȯ���ڴ� �����ϰ� ��� ��� 
	 */
	public void printMusicInfo(String musicInfo) {
		String ext=".mp3";
		String [] music=musicInfo.split(",");
		for(int i=0;i<music.length;i++) {
			if(music[i].endsWith(ext)) { 
				// replaceAll () : ���� ���ڿ��� ���� 
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
		="Dance The Night Away.mp3,Dejavu.mp3,�ѵζѵ�.mp3,������Ÿ.avi,�ϱؼ�.mp3";
		MusicService service=new MusicService();
		service.printMusicInfo(musicInfo);
	}
}
