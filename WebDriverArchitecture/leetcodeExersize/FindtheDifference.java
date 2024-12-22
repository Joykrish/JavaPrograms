package leetcodeExersize;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindtheDifference {

	public static void main(String args[]) {
		System.out.println(findDifferenceOne("abcd", "abcde"));
		System.out.println(findDifferenceTwo("abcd", "abcde"));
	}

	public static char findDifferenceOne(String str1, String str2) {

		int firstSum = 0;
		int secondSum = 0;

		for (int i = 0; i < str1.length(); i++) {
			firstSum += (int) str1.charAt(i);
		}

		for (int i = 0; i < str2.length(); i++) {
			secondSum += (int) str2.charAt(i);
		}

		return (char) (secondSum - firstSum);
	}

	public static char findDifferenceTwo(String str1, String str2) {
		Set<Character> set = new LinkedHashSet<>();
		for (char c : str1.toCharArray()) {
			set.add(c);
		}
		
		for (char c : str2.toCharArray()) {
			if(set.add(c)) {
				return c;
			}
		}
		return '\0';

	}

}
