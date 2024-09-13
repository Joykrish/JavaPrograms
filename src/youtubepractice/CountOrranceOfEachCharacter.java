package youtubepractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOrranceOfEachCharacter {
	
	
	public static void main(String[] args) {
	
		String str="harekrishnaRamaGovinda";
		
		
Map<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),1);
			}
			else {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
		}
		
		for(Character Char:map.keySet()) {
			System.out.println(Char+":"+map.get(Char));
		}
		

		
	}

}
