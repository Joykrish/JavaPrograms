package practicejavaprogramtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringReverseEachWordSentance {

	public static void main(String[] args) {

		String str = "Hare Krishan Radhe";

		String[] arr = str.split(" ");
		String reverseString = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			String reverseWord = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + arr[i].charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
	}

}