package practicejavaprogramtwo;

import java.util.Iterator;
import java.util.Scanner;

public class CountNumberofVovels {

	public static void main(String[] args) {

		System.out.println("Enter string ");

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		System.out.println(str);

		char[] character = str.toCharArray();

		int count = 0;

		for (char s : character) {
			switch (s) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u':
			count++;
			break;
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + s);
//			}
		}
		
	}
		System.out.println("Total vovels are "+count);
	}
}
