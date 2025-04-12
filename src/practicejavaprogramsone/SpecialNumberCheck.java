package practicejavaprogramsone;

import java.util.Scanner;

public class SpecialNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int digit1=num%10;
		int digit2=num/10;
		
		System.out.println((digit1+digit2)+(digit1*digit2)==num?"Special number":"No spcial number");
	}
}
