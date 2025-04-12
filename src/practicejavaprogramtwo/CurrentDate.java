package practicejavaprogramtwo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date dt1=new Date();
		
		String formatedDate=sdf.format(dt1);
		System.out.println(formatedDate);
	}

}
