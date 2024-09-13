package practice;

import java.util.Scanner;

public class FirstLetterCapital {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String state=sc.nextLine();
		
		String [] arr=state.split(" ");
		
		String newStatement="";
		
		for(String s:arr) {
			char c=s.charAt(0);
			String firstChar=String.valueOf(c).toUpperCase();
			String word=firstChar;
			for(int i=1;i<s.length();i++) {
				 word=word+s.charAt(i);
				
			}
			
			newStatement=newStatement+word+ " ";
			
		}
		System.out.println(newStatement);
	}
	

}
