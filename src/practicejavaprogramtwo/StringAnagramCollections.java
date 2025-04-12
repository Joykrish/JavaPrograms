package practicejavaprogramtwo;

import java.util.HashMap;
import java.util.Scanner;

public class StringAnagramCollections {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first String");
		String str1 = sc.nextLine();
		System.out.println("Enter second string");
		String str2 = sc.nextLine();

		if(isAnagram(str1, str2)) {
			System.out.println("Two strings are anagram");
		}else {
			System.out.println("Two strings are not anagram");
		}

	}

	public static boolean isAnagram(String str1, String str2) {

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < str1.length(); i++) {
			if (!map1.containsKey(str1.charAt(i))) {
				map1.put(str1.charAt(i), count);
			}
			else {
				map1.put(str1.charAt(i), map1.get(str1.charAt(i))+1);
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			if (!map2.containsKey(str2.charAt(i))) {
				map2.put(str2.charAt(i), count);
			}
			else {
				map2.put(str2.charAt(i), map2.get(str2.charAt(i))+1);
			}
		}
		return map1.equals(map2);
		
	}
	}
