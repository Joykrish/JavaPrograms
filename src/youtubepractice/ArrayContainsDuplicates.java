package youtubepractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayContainsDuplicates {
	public static void main(String[] args) {
		Integer [] arr= {1,45,7,8,2,23,25,78};
		
		List<Integer> list=Arrays.asList(arr);
		
		Set<Integer> set=new HashSet<>(list);
		
		if(list.size()==set.size()) {
			System.out.println("array not contains duplicate");
		}
		else {
			System.out.println("array containing duplicates");
		}
	}

}
