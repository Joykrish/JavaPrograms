package javaExersize.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementPresentInAtleast2Arrays {
	
	public static void main(String[] args) {
		Integer arr1[]= {2,5,7,9,0,4,4};
		Integer arr2[]= {2,6,7,9,3,1,4};
		Integer arr3[]= {0,5,7,8,9,4,2};
		
		HashSet<Integer> h=new HashSet<>();
		
		List l1=Arrays.asList(arr1);
		List l2=Arrays.asList(arr2);
		List l3=Arrays.asList(arr3);
		h.addAll(l3);
		h.addAll(l2);
		h.addAll(l1);
		
		for(int num:h) {
			if(l1.contains(num)&&l2.contains(num)||l1.contains(num) && l3.contains(num)||l2.contains(num)&&l3.contains(num)) {
				System.out.println(num);
			}
		}
		
		
		
		
		
	}

}
