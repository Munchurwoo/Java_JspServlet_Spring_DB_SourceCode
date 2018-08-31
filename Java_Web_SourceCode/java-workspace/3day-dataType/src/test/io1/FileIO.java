package test.io1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileIO {
	public static void main(String[] args) {
		
		try {
			File file = new File("src/test/io1/out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
