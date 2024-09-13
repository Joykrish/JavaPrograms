package practice;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
	
	
	public static boolean  isAnagram(String str1,String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		Map<Character,Integer> map1=getMapcount(str1);
		Map<Character,Integer> map2=getMapcount(str2);
		
		return map1.equals(map2);
		
		
		
	}
	
	private static Map<Character,Integer>getMapcount(String str) { 
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
	return map;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("listen","silent"));
		
	}

}
