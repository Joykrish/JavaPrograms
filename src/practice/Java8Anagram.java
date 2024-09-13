package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java8Anagram {

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		String sortedString1 = str1.toLowerCase().chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		String sortedString2 = str2.toLowerCase().chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
		return sortedString1.equals(sortedString2);
	}

	public static void main(String[] args) {
		
		System.out.println(isAnagram("listenb","silenta"));

	}

}
