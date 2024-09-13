package javaExersize.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		Integer [] arr= {1,2,5,7,2,4,9,7,1};
		List<Integer> ar= new ArrayList<Integer>();
		ar.addAll(Arrays.asList(arr));
		Set<Integer> st=new HashSet<Integer>(ar);
		System.out.println(st);
		
		
		String[] fruites= {"Mango","banana","pineapple","orrange","dryfruits","banana"};
		List<String> ls=new ArrayList<String>();
		ls.addAll(Arrays.asList(fruites));
		Set<String> stt=new HashSet<String>(ls);
		System.out.println(stt);
		
		int size=st.size();
		Integer[] afterDuplicates=new Integer[size];
		int i=0;
		for(Integer x:st) {
			afterDuplicates[i++]=x;
		}
		
		System.out.println(Arrays.toString(afterDuplicates));
		
	}

}
