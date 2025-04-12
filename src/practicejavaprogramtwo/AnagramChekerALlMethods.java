package practicejavaprogramtwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramChekerALlMethods {

	
	public static boolean isAnagram(String str1, String str2) {
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}
		if (getAnagramMap(str1).equals(getAnagramMap(str2))) {
			return true;
		}

		return false;
	} 
	
	public static boolean isAnagramTwo(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] aar1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Arrays.sort(aar1);
		Arrays.sort(arr2);
		
		return Arrays.equals(aar1, arr2);
		
		
	}

	public static Map<Character, Integer> getAnagramMap(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : str.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}

		}

		return map;

	}
	
	public static boolean isAnagramThree(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] arr=str1.toCharArray();
		
		StringBuffer sb=new StringBuffer(str2);
		
		for(Character c:arr) {
			int index=sb.indexOf(String.valueOf(c));
			
			if(index==-1) {
				return false;
			}
			else {
				sb.deleteCharAt(index);
			}
			
			
		}
		
		return sb.length()==0;
		
	}
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		System.out.println(isAnagram(str1,str2));
		System.out.println(isAnagramTwo(str1,str2));
		System.out.println(isAnagramThree(str1,str2));
	}

}
