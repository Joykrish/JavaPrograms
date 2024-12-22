package leetcodeExersize;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {
public static void main(String []args) {
	int [] arr= {1,2,3,1};
	int [] arr1= {1,2,3,1,2,3};
 System.out.println(containsDuplicate(arr,3));
 System.out.println(containsDuplicate(arr1,2));
	
}
	
	
	public static boolean containsDuplicate(int [] arr,int k) {
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			}
			else {
				int diff=Math.abs(map.get(arr[i])-i);
				if(diff<=k) {
					return true;
				}
				else {
					map.put(arr[i], i);
				}
			}
		}
		return false;
		
	}

}

