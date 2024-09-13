package youtubepractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap {
	
	public static void main(String[] args) {
		Map<Integer,Character> map=new HashMap<>();
		
		map.put(1, 'h');
		map.put(2, 'a');
		map.put(3, 'r');
		map.put(4, 'e');
		map.put(5, 'k');
		
		for(Integer i:map.keySet()) {
			System.out.println(map.get(i));
		}
		
		System.out.println("Using entry set==================================");
		
		for(Map.Entry<Integer, Character> mp:map.entrySet()) {
	System.out.println(mp.getKey()+" :"+mp.getValue());
	}
		
		System.out.println("usint iterator================================");
Iterator<Map.Entry<Integer,Character>> itr=map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, Character> entry=itr.next();
			System.out.println("key is"+entry.getKey());
			System.out.println("Value is"+entry.getValue());
		}
		
		System.out.println("using stream====================================");
		
		map.entrySet().stream().forEach(e->System.out.println(e.getKey()+"---"+e.getValue()));
		
		System.out.println("using for each==========================");
		
		map.forEach((key,value)->{
			System.out.println("Using foreach: "+key);
			System.out.println("Using foreach: "+value);
		});

}
}
