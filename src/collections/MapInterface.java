package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		//Map<String, Integer> hm = new HashMap<String, Integer>();
		//Map<String, Integer> hm = new LinkedHashMap<String, Integer>();//will retain the insertion order
		Map<String, Integer> hm = new TreeMap<String, Integer>();
		
		hm.put("Radha", new Integer(100));
		hm.put("Madhav", new Integer(200));
		hm.put("Govinda", new Integer(300));
		hm.put("ShamSundar", new Integer(400));
		hm.put("Mukunda", new Integer(400));
		hm.put("Balaram", new Integer(500));
		hm.put("Krishna", 600);
		

		for (Map.Entry<String, Integer> mp : hm.entrySet()) {
			System.out.print(mp.getKey());
			System.out.println(" " + mp.getValue());
		}
	}

}
