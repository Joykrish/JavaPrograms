package youtubepractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArrays {
	public static void main(String[] args) {
		
		System.out.println(isPalinodrome("madam1"));
		
	
}
	
	public static boolean isPalinodrome(String str) {
		String reverseString="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString=reverseString+str.charAt(i);
		}
		
		return str.equals(reverseString);
		
	}
	

}
