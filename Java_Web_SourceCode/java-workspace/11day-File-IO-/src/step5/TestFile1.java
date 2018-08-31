package step5;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
   public static void main(String[] args) {
      File dir = new File("C:\\java-kosta");
      System.out.println(dir.exists()); // �����ϸ� true
      System.out.println(dir.isFile()); //�����̸� true
      System.out.println(dir.isDirectory());
      //��ü ��θ��� Ȯ��
      System.out.println(dir.getPath());
      File dir2 = new File(dir.getPath()+File.separator+"hi");
      System.out.println(dir2.getPath());
      System.out.println(dir2.isDirectory());   // ���� ���̹Ƿ� false;
    //  boolean flag = dir2.mkdirs();   //���丮(�������丮����)����
      boolean flag = dir2.mkdir(); //������ ����
      System.out.println("���丮 ��������:"+flag);
      // java-kosta\\test ���丮 �Ʒ��� ������ ����
      File file = new File(dir2.getPath()+File.separator+"a.txt");
      System.out.println(file.getPath());
      System.out.println(file.isFile());
      try {
         boolean fileFlag=file.createNewFile(); //�����ϸ� �ȸ����, �������� ������ �������
         System.out.println(file.getName()+"������ ����"+fileFlag);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      //��� ������ file�� ������ ���丮�� �˰� �ʹ�
      String parent = file.getParent();
      System.out.println(parent); // ������ ���丮 �� ���
      // ���� ���丮 ������ String�� �ƴ϶� File ��ü�� ��ȯ�޴´�.
      File parentFile = file.getParentFile();
      System.out.println(parentFile.getPath());
      System.out.println(parentFile.isDirectory());
      //a.txt�� ���� ��ġ�� �ִ� ���ϸ��� ��� ����ϼ���
      File list[]=parentFile.listFiles();
      for(int i=0;i<list.length;i++) {
    	  System.out.println(list[i]
    			  );
         if(list[i].isFile())System.out.println(list[i].getName());
      }
   }
}