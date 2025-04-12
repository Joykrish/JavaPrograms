package practicejavaprogramtwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesArray {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,3,4,5,4,1,23,34,1,45,11,14};
		
		 HashSet<Integer> set=new LinkedHashSet<Integer>();
		 
		 for(int i=0;i<arr.length;i++) {
			 set.add(arr[i]);
		 }
		 
		 Integer processedArray[]=set.toArray(new Integer[set.size()]);
		 
		 System.out.println(Arrays.toString(processedArray));
	}

}
