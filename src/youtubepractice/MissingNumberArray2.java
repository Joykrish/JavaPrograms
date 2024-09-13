package youtubepractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumberArray2 {
	
	public static void main(String[] args) {
		int arr[]= {1,2,4,6,7,8,9};
		System.out.println(missingNumberArray(arr));
		
	}
	
	public static int  missingNumberArray(int []arr) {
		Arrays.sort(arr);
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=1;i<=arr.length+1;i++) {
			set.add(i);
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
		if(set.contains(arr[i])) {
			set.remove(arr[i]);
		}
		}
		for(int a:set) {
		return a;
			
		}
		
		
		
		
		
		
		return 0;
		
		
	}

}
