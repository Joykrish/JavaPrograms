package javaExersize.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WhetherArrayContainsDuplicateorNot {
public static void main(String args[]) {
	Integer [] arr= {2,3,5,7,8};
	
	List<Integer> ls=Arrays.asList(arr);
	
	Set<Integer> st=new HashSet<>(ls);
	
	if(ls.size()!=st.size()) {
		System.out.println("Array Having Duplicate Elements");
	}
	else {
		System.out.println("Array doest Having Duplicate Elements");
	}
}
}
