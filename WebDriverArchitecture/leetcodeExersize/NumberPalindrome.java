package leetcodeExersize;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		
		int num=sc.nextInt();
		System.out.println("Number is palindrome: "+isPalindrome(num));
		System.out.println("Number is palindrome: "+isPalindromeString(num));
		
		
	}
	    public static boolean isPalindrome(int x) {
	        if (x < 0) {
	            return false;
	        } else{
	int rev=0;
	  int n = x;
	        while(x!=0){
	        int reminder=x%10;
	        rev=(rev*10)+reminder;
	        x=x/10;    
	        }
	        return (n==rev);
	    }
	}
	    
	    public static boolean isPalindromeString(int x) {
	    	   String str = Integer.toString(x);
	    	        StringBuilder rev = new StringBuilder(str).reverse();
	    	        return rev.toString().equals(str);
	    	}
	}



