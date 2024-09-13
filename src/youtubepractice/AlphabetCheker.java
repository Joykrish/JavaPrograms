package youtubepractice;

import java.util.Scanner;

public class AlphabetCheker {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("Given character is alphabet");
		}
		else {
			System.out.println("Given character is not alphabet");
		}
		
	}

}
