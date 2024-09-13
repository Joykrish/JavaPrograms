package javaExersize.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerifyArrayContainsDuplicate {
	
	public static void main(String[] args) {
		Integer [] arr= {1,4,7,6,4,2,7,1,2};
		
		List<Integer> ls=Arrays.asList(arr);
		
		Set<Integer> Duplicate=new HashSet<Integer>(ls);
		
		if(ls.size()!=Duplicate.size()) {
			System.out.println("Array contains Duplicate");
		}
		else {
			System.out.println("Array doesn't contains Duplicate");
		}
	}

}
