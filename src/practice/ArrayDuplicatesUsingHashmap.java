package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayDuplicatesUsingHashmap {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 4, 5, 7, 6, 7 };
		findDuplicateElementsByHashmap(arr);
	

	}

	public static void findDuplicateElementsByHashmap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);

			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		
		for(Integer x:map.keySet()) {
			if(map.get(x)>1) {
				System.out.println("Duplicate element is "+x);
			}
		}
		
	}
}
