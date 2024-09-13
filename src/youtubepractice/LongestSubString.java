package youtubepractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
	
		String str="Sandeep";
		
		countVovel(str);
	
	
	}
	
	public static void countVovel(String str) {
		
		int vovelsCount=0;
		int consonenetCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(isVovel(str.charAt(i))) {
				vovelsCount++;
			}
			else {
				consonenetCount++;
			}
		}
		
		System.out.println("Vovel count is"+vovelsCount);
		System.out.println("Consonent  count is"+consonenetCount);
		
		
	}
	
	public static boolean isVovel(char ch) {
		ch=Character.toUpperCase(ch);
		return (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');		
	}

}
