package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
	public static void main(String[] args) {
		//LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();//preserves insertion order
		TreeMap<String,String> map=new TreeMap<String,String>();//sort using alphabetical value of keys
		map.put("Hare", "Krishna");
		map.put("Govinda", "Mukunda");
		map.put("Radha", "Bhav");
		map.put("Madhusudan", "Madhu");
		map.put("Gopal", "Bolo");
		map.put("Radha", "Govinda");
		for(String word:map.keySet()) {
			System.out.println(word+":"+map.get(word));
			
		}
		
		for(Map.Entry<String, String> entry :map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}
	
	
	

}
