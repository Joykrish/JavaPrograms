package youtubepractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatitiveCharString {
	public static void main(String[] args) {
		String str="aaaavaaaa";
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),1);
			}
			else {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
		}
		
		 
		for(char c:map.keySet()) {
			if(map.get(c)==1) {
				System.out.println("First repeatating character is"+c);
				break;
			}
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		for(Map.Entry<Character, Integer> en:map.entrySet()) {
			if(en.getValue()==1) {
				System.out.println("First non repeatating char is"+en.getKey());
				return;
			}
			
			
			
			
				
			
			
		}
		throw new RuntimeException("don't find  repeatitive character");
		
		
	}

}
