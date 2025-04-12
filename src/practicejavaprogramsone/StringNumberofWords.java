package practicejavaprogramsone;

import java.util.Scanner;

public class StringNumberofWords {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
				
		System.out.println(str.length());
		int count=1;
	
		
		for(int i=0;i<str.length();i++) {
			if(Character.isWhitespace(str.charAt(i))) {
				count++;  
			}
		}
		System.out.println(count);
		
		System.out.println("-------------------------");
		System.out.println(str.split(" ").length);
	}

}
