package step6;

import java.io.File;

public class TestFile2 {
   public static void main(String[] args) {
      String path = "C:\\java-kosta\\util\\eclipse-jee-photon-R-win32-x86_64\\eclipse";
      File dir = new File(path);
      File[] list = dir.listFiles();
      for(int i=0;i<list.length;i++) {
         if(list[i].isFile())
            System.out.println(list[i].getName());
      }
   }
}