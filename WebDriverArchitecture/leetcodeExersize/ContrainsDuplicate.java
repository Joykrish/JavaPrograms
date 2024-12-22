package leetcodeExersize;

import java.util.HashSet;
import java.util.Set;

public class ContrainsDuplicate {
public static void main(String[] args) {
	int [] arr= {2,3,4,5,8,3,11};
	
	System.out.println("Arrays contains duplicate: "+hasDuplicate(arr));
	
	
}

public static boolean hasDuplicate(int [] arr) {
	Set<Integer> set=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++) {
		if(set.contains(arr[i])) {
			return true;
			
		}
		set.add(arr[i]);
		
		
	}
	return  false;
}
}
