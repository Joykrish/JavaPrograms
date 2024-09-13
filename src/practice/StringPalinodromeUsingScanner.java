package practice;

import java.util.Scanner;

public class StringPalinodromeUsingScanner {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to verify");
		String Orgstr=sc.nextLine();
		
		
		
		
		System.out.println(isPalinodrome(Orgstr));
	}

	private static boolean isPalinodrome(String str) {
		String reverseString="";
		for (int i=str.length()-1;i>=0;i--) {
			
			reverseString=reverseString+str.charAt(i);
		}
		
		if(str.equals(reverseString)) {
			return true;
		}
		else {
		return false;
		}
	}

}
