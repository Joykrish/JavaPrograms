package practicejavaprogramsone;

import java.util.Scanner;

public class StringEndsWithString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the main string: ");
		String s1=sc.nextLine();
		System.out.println("Enter the second string: ");
		String s2=sc.nextLine();
		
		int count=0;
		
		for(int i=s1.length()-1, j=s2.length()-1;j>=0;i--,j--) {
			if(s1.charAt(i)==s2.charAt(j)) {
				count++;
			}
			
		}
		
		System.out.println(count==s2.length()?"yes":"No");
		System.out.println("***********************************************");
		
		System.out.println(s1.endsWith(s2));
	}

}
