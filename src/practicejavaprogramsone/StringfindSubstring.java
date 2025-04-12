package practicejavaprogramsone;

import java.util.Scanner;

public class StringfindSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1=sc.nextLine();
		
		s1=s1.toLowerCase();
		
		String s2="hare";
		
		boolean  found=false; 
		 
		for(int i=0;i<s1.length();i++) {
			int k=i,j=0; 
			for(j=0;j<s2.length();j++) {
				if(s1.charAt(k)!=s2.charAt(j)) {
					break;
				}
				k++;
			}
			
			if(j==s2.length()) {
				found=true;
				break;
			}
		}
		
		System.out.println("Gold found: "+found);
		
		
	}

}
