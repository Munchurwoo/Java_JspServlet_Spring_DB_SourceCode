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
		System.out.println("1�� �޸��� ���, 2�� �޸��� �а� ���");
		String num = scan.nextLine();
		switch (num) {
		case "1":
			try {
				fw = new FileWriter(path);
				pw = new PrintWriter(fw);
				
				while (true) {
					System.err.println("�޸��忡 ����� ���� ��������.");
					a = scan.nextLine();
					if (a.equals("����"))
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
