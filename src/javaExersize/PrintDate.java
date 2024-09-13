package javaExersize;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDate {
	
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat st=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		String formateddate=st.format(date);
		System.out.println(formateddate);
		
		
	}

}
