package javaExersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareandCreateNewArray {
	
	public static void main(String[] args) {
		
		int [] arr1= {1,3,5,8,4};
		int [] arr2= {2,3,5,1,4};
		
		List<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				ls.add(arr1[i]);
			}
		}
		
		Object[] ar=ls.toArray();
		
		System.out.println(Arrays.toString(ar));
		
		for(Object o:ar) {
			System.out.println(o);
		}
	}

}
