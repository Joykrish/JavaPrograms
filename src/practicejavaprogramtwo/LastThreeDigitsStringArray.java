package practicejavaprogramtwo;

import java.util.Scanner;

public class LastThreeDigitsStringArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string");
		String str=sc.nextLine();
		
		char[] arr=str.toCharArray();
		String resultantString="";
		for(int i=arr.length-1;i>arr.length-4;i--) {
			resultantString=arr[i]+resultantString;
		}
		
		System.out.println("Last three digits are: "+resultantString);
	}

}
