package practice;

import java.util.HashSet;

public class StringFindLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcdeab";  
		
		System.out.println(LongestSubString(str));
		
	}
	public static String LongestSubString(String str){
		
		HashSet<Character> set=new HashSet<Character>();
		String longestOverall = "";
		String longestTillNow = "";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if (set.contains(c)) {
				longestTillNow="";     
				set.clear();
				
			}
			else {
				set.add(c);
				longestTillNow+=c;
			}
			
			if(longestTillNow.length()>longestOverall.length()) {
				longestOverall=longestTillNow;
			}
			
			
			
		}
		
	return longestOverall;
	}

}
