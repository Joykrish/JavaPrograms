package leetcodeExersize;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
	
	public static int SingleNumberTest(int [] arr) {
		Map<Integer,Integer> map=new  HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) 
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
			
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		
		int [] arr= {2,3,2,5,4,3,4};
		System.out.println("Value appreared for only once is: "+SingleNumberTest(arr));
		
	}

	

}
