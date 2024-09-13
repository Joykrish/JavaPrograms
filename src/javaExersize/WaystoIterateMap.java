package javaExersize;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WaystoIterateMap {
	
	public static void main(String[] args) {
	
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Orange");
		map.put(5, "Grapes");
		
		//iterateMap(map);
		//usingItertion(map);
		usingentrySet(map);
	}
	
	

	private static void usingItertion(Map<Integer, String> map) {
		Iterator<Map.Entry <Integer,String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> entry=itr.next();
			//System.out.println(entry.getKey()+ ":" +entry.getValue());
			System.out.println(entry);
		}
		
	}
	
	public static void usingentrySet(Map<Integer,String> map) {
		for(Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
			
		}
	}



	public static void iterateMap(Map<Integer,String> map) {
		for(Integer key:map.keySet()) {
			System.out.println(key +" : "+map.get(key) );
		}
		
	
		
	}

}
