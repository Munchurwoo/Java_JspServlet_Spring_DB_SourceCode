package step10;

import java.io.File;

/*		File ���� �� �̵� �׽�Ʈ 
 * 
 */
public class TestFile6 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\media\\music\\�ϱؼ�.mp3";
		//�����׽�Ʈ delete()
		File f=new File(path);
		boolean flag=f.delete();
		System.out.println(f.getName()+" delete "+flag);
		//�̵��׽�Ʈ renameTo()
		String orgPath="C:\\java-kosta\\test\\media\\music\\�ѵζѵ�.mp3";
		String destPath="C:\\java-kosta\\test\\alsongplayer\\�ѵζѵ�.mp3";
		//���丮 ���� 
		File destDir=new File(destPath).getParentFile();
		destDir.mkdirs();
		System.out.println("������ ���丮 ����");
		File orgFile=new File(orgPath);
		boolean moveFlag=orgFile.renameTo(new File(destPath));
		System.out.println("���� �̵� "+moveFlag);
	}
}







