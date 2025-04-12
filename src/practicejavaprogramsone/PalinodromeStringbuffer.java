package practicejavaprogramsone;

import java.util.Scanner;

public class PalinodromeStringbuffer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to be checked");
		
		String num=sc.next();
		
		StringBuffer reverse=new StringBuffer(num);
		
		StringBuffer rev=reverse.reverse();
		
		System.out.println("Reverse number is: "+rev.toString());
		
		System.out.println(rev.toString().equals(num)?"Palinodrome":"not palinodrome");
//		if(rev.toString().equals(num)) {
//			System.out.println("Number is  palinodrome");
//		}
//		else {
//			System.out.println("Number is not palinodrome");
//		}
		sc.close();
	}

}
