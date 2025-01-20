package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMap {
	
	public static void main(String[] args) {
		 Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("Mango", 5);
		map.put("Banana", 6);
		map.put("Pinnaple", 7);
		map.put("Orange", 8);
		map.put("applle", 5);
		map.put("Pamiogranate", 6);
		
		//iterateusingKeyset(map);
		//IteratorMap(map);
		 
		//usingEntrySet(map);
		//usingStreams(map);
		usingForeach(map);
		
		

	}
	
	
	private static void  iterateusingKeyset(Map<String,Integer>mp) {
		for(String str:mp.keySet()) {
			System.out.println("key is: "+str);
			System.out.println("Values is  "+mp.get(str));
		}
	}
	
	private static void IteratorMap(Map<String,Integer>mp) {
		Iterator<Entry<String, Integer>>itr=mp.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry=itr.next();
			System.out.println("key="+entry.getKey());
			System.out.println("value="+entry.getValue());
		}
		
		
		 
	}
	public static void usingEntrySet(Map<String,Integer> map) {
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("The entry key  is="+entry.getKey());
			System.out.println("the entry value  is="+entry.getValue());
		}
	}
	
	public static void  usingStreams(Map <String,Integer>map) {
		map.entrySet().stream().forEach(e->System.out.println("Key"+e.getKey() +":"+"value:"+e.getValue()));
	}
	
	public static void usingForeach(Map<String,Integer>map) {
		map.forEach((key,value)->{
			System.out.println("key:"+key);
			System.out.println("value:"+value);
		});
		
	}
}
