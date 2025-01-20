package leetcodeExersize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestDigitString {
	
	public static void main(String []args) {
	 String str="ancdsds3634234ds";
	 
	 Set<Character> set=new HashSet<Character>();
	 
	 
	 for(int i=0;i<str.length();i++) {
		 if(Character.isDigit(str.charAt(i))) {
			 set.add(str.charAt(i));
		 }
	 }
	 
	 List<Character> list=new ArrayList<>(set);
	 
	 Collections.sort(list);
	 
	 System.out.println("Second highest element is: "+list.get(list.size()-2));
	 
	}

}
