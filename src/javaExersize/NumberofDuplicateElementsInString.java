package javaExersize;

import java.util.HashSet;
import java.util.Set;

public class NumberofDuplicateElementsInString {
	public static void main(String[] args) {
		String str="HareeKrishnna";
		int count=0;
		char[] st=str.toCharArray();
		
		Set<Character> set=new HashSet<>();
		for(char c:st) {
			if
			(set.add(c)) {
				
			}
			else {
				System.out.println("Duplicate character is " + c);
				count++;
			}
		}
		System.out.println("Duplicate character count is  "+count);
	}
	
	
	

}
