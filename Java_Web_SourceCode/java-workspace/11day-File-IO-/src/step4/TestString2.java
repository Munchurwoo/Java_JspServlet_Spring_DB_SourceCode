package step4;
class MusicService{
	/*
	 * Dance The Night Away 
	 * �ѵζѵ�
	 * �ϱؼ� 
	 * --> .mp3 ������ ���, Ȯ���ڴ� �����ϰ� ��� ��� 
	 */
	public void printMusicInfo(String musicInfo) {
		String music[] =musicInfo.split(",");
		for(int i=0;i<music.length;i++ ) {
			if(music[i].endsWith(".mp3"))
				// replaceAll() : ���� ���ڿ��� ���� 
//				System.out.println(music[i].replaceAll(".mp3",""));
//				int index =music[i].lastIndexOf(".");
//				System.out.println(music[i].sub);
				System.out.println(music[i].substring(0,music[i].indexOf(".")));
		}
	}
}
public class TestString2 {
	public static void main(String[] args) {
		String musicInfo="Dance The Night Away.mp3,Dejavu.mp3,�ѵζѵ�.mp3,������Ÿ.avi,�ϱؼ�.mp3";
		MusicService service = new MusicService();
		service.printMusicInfo(musicInfo);
	}
}
