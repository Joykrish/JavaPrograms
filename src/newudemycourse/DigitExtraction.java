package newudemycourse;

import java.util.Scanner;

public class DigitExtraction {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	
	while(num>0) {
		int reminder=num%10;
		System.out.print(reminder+ " ");
		num=num/10;
	
	}
	
}
}
