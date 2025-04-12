 package practicejavaprogramtwo;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="harekrishanrama";
		
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(!mp.containsKey(str.charAt(i))) {
				mp.put(str.charAt(i), count);
			}
			else {
				mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
			}
		}
		
		String compressed="";
		
		for(Entry<Character,Integer> entry:mp.entrySet()) {
			compressed=compressed+entry.getKey()+entry.getValue();
		

	}
		System.out.println(compressed);
	}
}
