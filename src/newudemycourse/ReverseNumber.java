package newudemycourse;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		int num1=num;
		int rev=0;
		while(num!=0) {
			int reminder=num%10;
			rev=rev*10+reminder;
			num=num/10;
		}
		
		System.out.println("Reverse Number is: "+rev);
		
		if(num1==rev) {
			System.out.println("Number is palinodrome");
		}else {
			System.out.println("Number is not palinodrome");
		}
		
		
	}

}
