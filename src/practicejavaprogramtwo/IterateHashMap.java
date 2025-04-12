package practicejavaprogramtwo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Radha");
		map.put(2, "Govinda");
		map.put(3, "Mukunda");
		map.put(4, "Madhav");

		//KeysetIteration(map);
		//iterator(map);
		//byEntrySet(map);
		//streams(map);
foreachloop(map);
	}

	private static void foreachloop(Map<Integer, String> map) {
		map.forEach((key,value)->{
		System.out.println(key +" "+value);
		});
		
	}

	private static void streams(Map<Integer, String> map) {
		map.entrySet().stream().forEach(e->
		System.out.println(e.getKey()+ " "+e.getValue()));
		
	
		
	}

	private static void byEntrySet(Map<Integer, String> map) {
		for(Map.Entry<Integer,String>entry :map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
	}

	private static void iterator(Map<Integer, String> map) {
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer,String> entry=itr.next();
			System.out.println("key="+entry.getKey());
			System.out.println("key="+entry.getValue());
			
		}

	}

	private static void KeysetIteration(Map<Integer, String> map) {
		for (Integer a : map.keySet()) {
			System.out.println("Key value:" + a);
			System.out.println("Value is:" + map.get(a));

		}
	}
}
