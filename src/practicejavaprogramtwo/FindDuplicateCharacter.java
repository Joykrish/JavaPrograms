package practicejavaprogramtwo;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {
	
	public static void main(String[] args) {
		String str="harekrishnaharerama";
		
		char[] arrayChar=str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		Integer count=1;
		
		for(int i=0;i<arrayChar.length;i++) {
			
			if(!map.keySet().contains(arrayChar[i])) {
				map.put(arrayChar[i], count);
			}
			else {
				map.put(arrayChar[i], map.get(arrayChar[i])+1);
			}
		}
		
		for (Character c : map.keySet()) {
			
			if(map.get(c)>1) {
				System.out.println("Duplicate character is  "+ c + "  and occured for "+ map.get(c)+ " times");
			}
			
		}
	}

}
