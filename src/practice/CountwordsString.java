package practice;

import java.util.Arrays;
import java.util.HashMap;

public class CountwordsString {
	
	public static void main(String[] args) {
		String str="I am learning learning java java java programming";
		
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		Integer count=1;
		String [] arrayString=str.split(" ");
		
		for(int i=0;i<arrayString.length;i++) {
			if(!map.containsKey(arrayString[i])) {
				map.put(arrayString[i], count);
			}
			else {
				map.put(arrayString[i], map.get(arrayString[i])+1);
			}
			
		}
		
		for (String ele : map.keySet()) {
			System.out.println(ele+ ":"+map.get(ele));
			
		}
	}

}
