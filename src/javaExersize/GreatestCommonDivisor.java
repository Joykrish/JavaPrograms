package javaExersize;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=sc.nextInt();
		System.out.println("Enter the second number");
		int secondNumber=sc.nextInt();
		sc.close();
		int gcd=0;
		for(int i=1;i<=firstNumber && i<=secondNumber;i++) {
			if(firstNumber%i==0 && secondNumber%i==0 ) {
				gcd=i;
				
			}
		}
		System.out.println(gcd);
	}

}
