package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUnit {

	public static void main(String[] args) throws ParseException {
		String oldstring = "2011-01-18";
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(oldstring);
		String newstring = new SimpleDateFormat("yyyy년 MM월 dd일").format(date);
		System.out.println(newstring); //2011년 01월 18일
	}

}
