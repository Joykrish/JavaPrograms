package practice;

import java.util.Scanner;

public class FindquotientandReminder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int number=sc.nextInt();
		System.out.println("Enter the Divisor");
		int divisor=sc.nextInt();
		
		System.out.println("Quotient is:"+number/divisor);
		System.out.println("Divisor is:"+number%divisor);
	}

}
