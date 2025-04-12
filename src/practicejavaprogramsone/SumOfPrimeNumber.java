package practicejavaprogramsone;

import java.util.Scanner;

public class SumOfPrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int multipleSum=0;
		while(num!=0) {
		int digit=num%10;
		if(digit==3 ||digit==9||digit==6) {
			multipleSum=multipleSum+digit;
		}
		num=num/10;
		}
		System.out.println("Sum of  multiples  of  3  is "+multipleSum);
	}

}
