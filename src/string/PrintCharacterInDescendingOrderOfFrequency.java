package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintCharacterInDescendingOrderOfFrequency {
	
	public static void main(String[] args) {
		
		String str="banana";
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(mp.get(c)!=null) {
				mp.put(c, mp.get(c)+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		
		Set<Entry<Character,Integer>> st=mp.entrySet();
		List<Entry<Character,Integer>> ls=new ArrayList<Entry<Character,Integer>>(st);
		Collections.sort(ls,new Comparator<Map.Entry<Character,Integer>>(){

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		for(Entry<Character,Integer>entry:ls) {
		System.out.println(entry.getKey() +" : "+entry.getValue());
	}

}
}
