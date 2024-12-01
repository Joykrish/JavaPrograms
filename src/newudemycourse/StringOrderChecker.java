package newudemycourse;

import java.util.Arrays;
import java.util.Scanner;

public class StringOrderChecker {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string to check: ");
		String str=sc.nextLine();
		
		char[] arr=str.toCharArray();
		
		Arrays.sort(arr);
		
		String sortedstr=new String(arr);
		
		System.out.println(str.equals(sortedstr)?"sorted string":"non sorted");
		
		
		
	}

}
