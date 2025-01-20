package leetcodeExersize;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
	
	public static void main(String[] args) {
		String str="abbaca";
		
		System.out.println(removeDuplicates(str));
	}
	
	
	public static String removeDuplicates(String str) {
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(st.isEmpty()) {
				st.push(ch);
			}
			else if(st.peek()==ch) {
				st.pop();
			}
			else {
				st.push(ch);
			}
		}
		StringBuffer sb=new StringBuffer();
		
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.reverse().toString();
		
	}

}
