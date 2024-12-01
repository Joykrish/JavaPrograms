package newudemycourse;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed: ");
		int num=sc.nextInt();
//		int rev=0;
//		while(num!=0) {
//			int reminder=num%10;
//			rev=rev*10+reminder;
//			num=num/10;       
//		}
//		
//		System.out.println(rev);
		
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		if(count!=0) {
			System.out.println("not a prime number");
		}
		else {
			System.out.println("prime number");
		}
		
	}
}
