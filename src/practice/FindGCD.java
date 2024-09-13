package practice;

import java.util.Scanner;

public class FindGCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=sc.nextInt();
		System.out.println("Enter the Second number");
		int SecondNumber=sc.nextInt();
		int gcd = 0;
		for(int i=1;i<=firstNumber&&i<=SecondNumber;i++) {
			if(firstNumber%i==0 && SecondNumber%i==0) {
				gcd=i;
				//break;
			}
		}
		
		System.out.println("Greatest common divisor is "+gcd);
	}

}
