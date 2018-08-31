package step12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {
		String path = "C:\\java-kosta\\test\\b.txt";
		FileWriter fw = null;
		PrintWriter pw = null;
		Scanner scan = new Scanner(System.in);
		String a = null;
		System.out.println("1번 메모장 기록, 2번 메모장 읽고 출력");
		String num = scan.nextLine();
		switch (num) {
		case "1":
			try {
				fw = new FileWriter(path);
				pw = new PrintWriter(fw);
				
				while (true) {
					System.err.println("메모장에 기록할 말을 적으세요.");
					a = scan.nextLine();
					if (a.equals("종료"))
						break;
					pw.append(a);
				}

			} finally {
				if (scan != null)
					scan.close();
				if (pw != null) {
					pw.close();
				}
				if (fw != null)
					fw.close();
			}
		case "2":
			FileReader fr = null;
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(path));
				System.out.println(br.readLine());
			} finally {
				if(br!=null)
					br.close();
				if(fr!=null)
					fr.close();
			}
		}
	}
}
