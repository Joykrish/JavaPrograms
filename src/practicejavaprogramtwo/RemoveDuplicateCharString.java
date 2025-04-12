package practicejavaprogramtwo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharString {
	
	public static void main(String[] args) {
		String str="coconut";
		
		Set<Character> st=new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			st.add(str.charAt(i));
		}
		//String afterremoved="";
		StringBuffer sb=new StringBuffer();
		for(char c:st) {
			//afterremoved=afterremoved+c;
			sb.append(c);
		}
		
		//System.out.println(afterremoved);
		System.out.println(sb);

	}
	
	
}
