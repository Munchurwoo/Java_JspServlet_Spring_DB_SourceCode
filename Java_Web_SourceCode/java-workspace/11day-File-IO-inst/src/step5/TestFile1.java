package step5;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) {
		File dir=new File("C:\\java-kosta");
		System.out.println(dir.exists());//�����ϸ� true
		System.out.println(dir.isFile());//�����̸� true 
		System.out.println(dir.isDirectory());//���丮�̸� true 
		//��ü ��θ��� Ȯ��
		System.out.println(dir.getPath());
		// java-kosta�� ���� ���丮 test �� �����غ��� 
		File dir2=new File(dir.getPath()+File.separator+"test");
		System.out.println(dir2.getPath());
		System.out.println(dir2.isDirectory());//�������̹Ƿ� false 
		boolean flag=dir2.mkdirs(); //���丮(�������丮����) ���� 
		System.out.println("���丮 ��������:"+flag);
		// java-kosta\\test ���丮 �Ʒ��� ������ ���� 
		File file=new File(dir2.getPath()+File.separator+"a.txt");
		// �ش� ������ �������� �����Ƿ� IOException �߻��Ǿ� throws �ȴ� 
		//File file=new File("R:"+File.separator+"a.txt"); 
		System.out.println(file.getPath());
		System.out.println(file.isFile());
		try {
			boolean fileFlag=file.createNewFile();
			System.out.println(file.getName()+" ������ ���� "+fileFlag);
		} catch (IOException e) {		
			e.printStackTrace();
		}
		// ��� ������ file �� ������ ���丮�� �˰� �ʹ� 
		String parentName=file.getParent();
		System.out.println(parentName);
		// ���� ���丮 ������ String �� �ƴ϶� File ��ü�� ��ȯ�޴´� 
		File parentFile=file.getParentFile();
		System.out.println(parentFile.getPath());
		System.out.println(parentFile.isDirectory());
		//a.txt �� ���� ��ġ�� �ִ� ���ϸ��� ��� ����ϼ��� 
		File list[]=parentFile.listFiles();
		for(int i=0;i<list.length;i++) {
			if(list[i].isFile()) {
				System.out.println(list[i].getName());
			}
		}			
	}
}













