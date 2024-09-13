package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("Radha", "Madhav");
		map.put("Kunja","Bihari");
		map.put("Gopijan", "vallabh");
		map.put("Giridhari","Gopinath");
		map.put("Radha", "Giridhari");
				
		System.out.println(map);
		System.out.println(map.size()); 
		System.out.println(map.get("Radha"));
		
		Set<String> keys=map.keySet();
		System.out.println(keys);
		
		for(String key:keys) {
			//System.out.println(key);
			//System.out.println(map.get(key));
			System.out.println(key +":"+map.get(key));
		}
		
		Map<String,List<String>> mp=new HashMap<String,List<String>>();
		
		List<String> al=new ArrayList<String>();
		al.add("abc@xyz.com");
		al.add("abc@pqr.com");
		al.add("abc@lmn.com"); 
		
		mp.put("email", al);
		System.out.println(mp);
	}

}
