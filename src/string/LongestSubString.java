package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	
	public static void  main(String[] args) {
		
		String str="abcdefab";
		
		System.out.println(longestSubString(str));
	}

	public static String longestSubString(String str) {
		String lonestTillNow="";
		String longestOverall="";
		Set<Character> st=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(st.contains(c)) {
				lonestTillNow="";
				st.clear();
			}
			lonestTillNow+=c;
			st.add(c);
			if(lonestTillNow.length()>longestOverall.length()) {
				longestOverall=lonestTillNow;
			}
		}
		return longestOverall;
	}
}
