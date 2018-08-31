package step11;

import java.io.File;

public class MoveFileService {
	public void moveAll(String orgPath, String destPath, String ext) {
		new File(destPath).mkdirs();
		File orgDir=new File(orgPath);
		File [] orgFile=orgDir.listFiles();
		for(int i=0;i<orgFile.length;i++) {
			if(orgFile[i].isFile()&&orgFile[i].getName().endsWith(ext)) {
				orgFile[i].renameTo(
						new File(destPath+File.separator+orgFile[i].getName()));
			}//if
		}//for
	}//method
}//class

//
//String orgPath="C:\\java-kosta\\test\\media\\music";
//String destPath="C:\\java-kosta\\test\\mediaplayer";
//MoveFileService service=new MoveFileService();
//String ext=".mp3";
////���丮�� �ٸ� Ȯ���� ������ �����ϰ� ext �� ��ġ�ϴ�
////Ȯ���ڸ� ���� ���ϵ��� destPath ���丮�� ��� �̵� 
//service.moveAll(orgPath,destPath,ext);
//System.out.println("���丮 �� mp3������ ��� �̵�");







