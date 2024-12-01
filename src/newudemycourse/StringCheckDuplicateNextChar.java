package newudemycourse;

import java.util.Scanner;

public class StringCheckDuplicateNextChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		boolean isFound=false;
		for(int i=0;i<str.length()-1;i++) {
			
			
			if(str.charAt(i)==str.charAt(i+1)) {
				System.out.println("Consecutive duplicate character is present:"+str.charAt(i));
				isFound=true;
				break;
			}
			
			
			
		}
		if(!isFound) {
			System.out.println("No duplicate character");
		}
	}

}
