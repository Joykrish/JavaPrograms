package youtubepractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {
	
	public static void main(String[] args) {
		String str="harekrishnaramagovinda";
		
		System.out.println(removeDuplicateString(str));
	}
	
	public static String removeDuplicateString(String str) { 
		
		Set<Character> set=new HashSet<Character>();
		StringBuffer sb=new StringBuffer();
		char[] arr=str.toCharArray();
		
		for(Character c:arr) {
			if(set.add(c)) {
				sb=sb.append(c);
			}
			
		}
		
		return sb.toString();

}
}
