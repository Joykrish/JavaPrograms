package practice;

import java.util.Scanner;

public class CountEvenAndOddDigits {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		sc.close();
		
		int evenCount=0;
		int oddCount=0;
		
		while(number>0) {
			int digit=number%10;
			if(digit%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			number=number/10;
		}
		
		System.out.println("Even count is"+evenCount);
		System.out.println("ODD count is"+oddCount);
	}

}
