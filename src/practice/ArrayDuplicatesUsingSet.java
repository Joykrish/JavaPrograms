package practice;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicatesUsingSet {
	
	public static void main(String[] args) {
		int [] arr= {1,3,4,6,4,5,7,6,7};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				System.out.println("Duplicate element is array"+arr[i]);
			}
		}
		
		System.out.println(set);
		
	}

}
