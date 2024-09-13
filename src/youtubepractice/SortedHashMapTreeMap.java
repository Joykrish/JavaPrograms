package youtubepractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedHashMapTreeMap {
	
	
	public static void main(String[] args) {
		Map<String,String> mp=new HashMap<String,String>();
		
		mp.put("aniruddha", "Krishna");
		mp.put("gopal", "Krishna");
		mp.put("hare", "Krishna");
		mp.put("radhe", "Krishna");
		mp.put("madhu", "Krishna");
		
		
		for(Map.Entry<String,String> map:mp.entrySet()) {
			System.out.println(map.getKey());
		}
		System.out.println("Before sorting ============================== ");
		Map<String,String> st=new TreeMap<String,String>(mp);
		
		for(Map.Entry<String, String> Tmap:st.entrySet()) {
			System.out.println(Tmap.getKey());
		}
		
	}

}
