package step5;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
   public static void main(String[] args) {
      File dir = new File("C:\\java-kosta");
      System.out.println(dir.exists()); // 존재하면 true
      System.out.println(dir.isFile()); //파일이면 true
      System.out.println(dir.isDirectory());
      //전체 경로명을 확인
      System.out.println(dir.getPath());
      File dir2 = new File(dir.getPath()+File.separator+"hi");
      System.out.println(dir2.getPath());
      System.out.println(dir2.isDirectory());   // 생성 전이므로 false;
    //  boolean flag = dir2.mkdirs();   //디렉토리(하위디렉토리까지)생성
      boolean flag = dir2.mkdir(); //없으면 생성
      System.out.println("디렉토리 생성여부:"+flag);
      // java-kosta\\test 디렉토리 아래에 파일을 생성
      File file = new File(dir2.getPath()+File.separator+"a.txt");
      System.out.println(file.getPath());
      System.out.println(file.isFile());
      try {
         boolean fileFlag=file.createNewFile(); //존재하면 안만들고, 존재하지 않으면 만들어줌
         System.out.println(file.getName()+"파일을 생성"+fileFlag);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      //방금 생성한 file을 보유한 디렉토리를 알고 싶다
      String parent = file.getParent();
      System.out.println(parent); // 보유한 디렉토리 명 출력
      // 상위 디렉토리 정보를 String이 아니라 File 객체로 반환받는다.
      File parentFile = file.getParentFile();
      System.out.println(parentFile.getPath());
      System.out.println(parentFile.isDirectory());
      //a.txt와 같은 위치에 있는 파일명을 모두 출력하세요
      File list[]=parentFile.listFiles();
      for(int i=0;i<list.length;i++) {
    	  System.out.println(list[i]
    			  );
         if(list[i].isFile())System.out.println(list[i].getName());
      }
   }
}