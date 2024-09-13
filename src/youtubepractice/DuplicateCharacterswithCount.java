package youtubepractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterswithCount {
public static void main(String[] args) {
	String str="harekrishnaramagovinda";
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	
	
	char []arr=str.toCharArray();
	
	for(int i=0;i<arr.length;i++) {
		if(!map.containsKey(arr[i])) {
			map.put(arr[i], 1);
		}
		else {
			map.put(arr[i], map.get(arr[i])+1);
		}
	}
	
	for(Map.Entry<Character, Integer> mp:map.entrySet()) {
		if(mp.getValue()>1) {
			System.out.println(mp.getKey()+":"+mp.getValue());
		}
}
}
}
