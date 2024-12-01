package newudemycourse;

import java.util.Scanner;

public class StringDuplicateCharGenerator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			sb.append(str.charAt(i));
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb);
	}

}
