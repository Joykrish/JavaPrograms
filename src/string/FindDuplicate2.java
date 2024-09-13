package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicate2 {
	public static void main(String[] args) {
		String str="I like banana eatingk";
		
		char [] arr=str.toCharArray();
		
		Set<Character> st=new LinkedHashSet<>();
		String dup="";
		for(char c:arr) {
		 boolean count=st.add(c);
		 if(count==false) {
			if(!dup.contains(Character.toString(c))) {
				dup+=c+",";
			}
		 }
			
		}
		System.out.println(dup);
	}

}
