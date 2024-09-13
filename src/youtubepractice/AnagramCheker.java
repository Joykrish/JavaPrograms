package youtubepractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheker {

	public static void main(String[] args) {
		String str1 = "orhkis";
		String str2 = "kishor";
		System.out.println("Using Stringbuffer: "+anagramCheckerUsingStringBuffer(str1, str2));
		System.out.println("Using Arrays sort: "+anagramCheckerUsingArraysort(str1, str2));
		System.out.println("Using map: "+anagramCheckerUsingMap(str1,str2));
	}

	public static boolean anagramCheckerUsingStringBuffer(String str1, String str2) {
		char[] characterArray = str1.toCharArray();

		StringBuffer sb = new StringBuffer(str2);

		for (char c : characterArray) {
			int index = sb.indexOf(String.valueOf(c));
			if (index != -1) {
				sb.deleteCharAt(index);
			} else {
				return false;
			}

		}

		return sb.length() == 0;

	}
	
	public static boolean anagramCheckerUsingArraysort(String str1, String str2) {
		char[] arr1=str1.toCharArray();
		char [] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			return true;
		}
		else {
			return false;
		}

	}
	
	public static boolean anagramCheckerUsingMap(String str1, String str2) {
		Map<Character,Integer>map1=new HashMap<>();
		Map<Character,Integer>map2=new HashMap<>();
		
		for(int i=0;i<str1.length();i++) {
			if(!map1.containsKey(str1.charAt(i))) {
				map1.put(str1.charAt(i), 1);
			}
			else {
				map1.put(str1.charAt(i), map1.get(str1.charAt(i))+1);
			}
		}
		for(int i=0;i<str2.length();i++) {
			if(!map2.containsKey(str2.charAt(i))) {
				map2.put(str2.charAt(i), 1);
			}
			else {
				map2.put(str2.charAt(i), map2.get(str2.charAt(i))+1);
			}
		}
		
		return map1.equals(map2);

	}

}
