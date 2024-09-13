package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args) {
	String str="hareKrishna";
	Set<Character> st=new LinkedHashSet<Character>();
	
	for(int i=0;i<str.length();i++) {
		st.add(str.charAt(i));
	}
	StringBuffer sb=new StringBuffer();
	for(Character c:st) {
		sb.append(c);
		
	}
	System.out.println(sb);

}
}
