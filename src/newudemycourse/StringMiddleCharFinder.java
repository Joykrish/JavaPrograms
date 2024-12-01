package newudemycourse;

import java.util.Scanner;

public class StringMiddleCharFinder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		int length=str.length();
		
		if(length%2==0) {
			System.out.println(str.substring(length/2-1,length/2+1));
		}
		else {
			System.out.println(str.substring(length/2,length/2+1));
		}
		

	}
}
