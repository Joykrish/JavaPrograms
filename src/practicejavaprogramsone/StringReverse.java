 package practicejavaprogramsone;

import java.util.Scanner;

public class StringReverse {
	
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String str=sc.next();
		
		String reverseString="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverseString+=str.charAt(i);
			
		}
		
		System.out.println("Reverse String is: "+reverseString);
		
		System.out.println("Using String buffer==================================");
		System.out.println(new StringBuffer(str).reverse());

				
	}

}
