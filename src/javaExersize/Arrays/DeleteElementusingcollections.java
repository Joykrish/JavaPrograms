package javaExersize.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteElementusingcollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr= {1,4,7,9,4,8};
		
		int index=3;
		
		List<Integer>ls=new ArrayList(Arrays.asList(arr));
		ls.remove(index);
		
		Object[] arr1=ls.toArray();
		System.out.println(Arrays.toString(arr1));

	}

}
