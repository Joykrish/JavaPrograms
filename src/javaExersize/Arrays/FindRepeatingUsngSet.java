package javaExersize.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatingUsngSet {
public static void main(String [] args) {
	int [] arr= {1,4,7,6,4,2,7,1,2};
	
	//usingOneSet(arr);
	System.out.println(usingTwoSet(arr));
	
	
}

private static void usingOneSet(int[] arr) {
	Set<Integer> st=new HashSet<Integer>();
	
	for(int i=0;i<arr.length;i++) {
		boolean b=st.add(arr[i]);
		
		if(!b) {
			System.out.println("Duplicate element is "+ arr[i]);
		}
	}
}


public static Set<Integer> usingTwoSet(int [] arr) {
	
Set<Integer> st=new HashSet<Integer>();
Set<Integer> duplicateSet=new HashSet<Integer>();
for(int s:arr) {
	if(st.contains(s)) {
		st.add(s);
	}
	else {
		duplicateSet.add(s);
	}
}




return duplicateSet;
	
}
}