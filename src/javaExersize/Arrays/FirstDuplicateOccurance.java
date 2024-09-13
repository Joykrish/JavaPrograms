package javaExersize.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstDuplicateOccurance {
	
	public static void main(String[] args) {
	
	String [] fruits= {"apple","banana","grapes","pinapple","banana","orange"};
	Map<String,Integer> mp=new LinkedHashMap<String,Integer>();
	for(String fr:fruits) {
		if(!mp.containsKey(fr)) {
			mp.put(fr,1);
		}
		else {
			mp.put(fr,mp.get(fr)+1);
		}
		
	}
	for(Entry<String,Integer> entry:mp.entrySet()) {
		//System.out.println(entry.getKey() +" "+entry.getValue());
		if(entry.getValue()!=1) {
			System.out.println("First Duplicate Occurance is "+entry.getKey());
		}
		
	}

}
}
