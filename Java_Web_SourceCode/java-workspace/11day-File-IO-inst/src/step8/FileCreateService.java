package step8;

import java.io.File;
import java.io.IOException;

public class FileCreateService {
	public void createDirAndFile(String path) throws IOException {
		File file=new File(path);
		//���丮�� �����ϱ� ���� ���� ���丮 ������ ��´�
		File dir=file.getParentFile();
		//���丮�� �����Ѵ� 
		dir.mkdirs();
		//������ �����Ѵ� 
		file.createNewFile();
	}
}








