package practice;

import java.util.Scanner;

public class FindASCIIValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character to find Ascii value");
		
		char c=sc.nextLine().charAt(0);
		
		
		System.out.println("Ascii value is "+(int)c);
		
	}

}
