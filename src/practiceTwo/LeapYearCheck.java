package practiceTwo;

import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check");
		int year=sc.nextInt();
		sc.close();
		boolean leapYear=false;
		if(year %4==0) {
			if(year%100==0) {
				 if(year%400==0) {
					 leapYear=true;
				 }else {
					 leapYear=false;
				 }
				
			}else {
				leapYear=true;
			}
		}
		
		else {
			 leapYear=false;
		}
		
		if(leapYear) {
			System.out.println("Given year "+ year + "is a leap year");
		}
		else {
			System.out.println("Given year "+ year + "is not a  leap year");
		}

	}

}
