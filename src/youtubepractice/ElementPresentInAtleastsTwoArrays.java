package youtubepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementPresentInAtleastsTwoArrays {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 9, 8, 7 };
		Integer[] arr2 = { 4, 1, 2, 10, 15 };
		Integer[] arr3 = { 5, 1, 2, 4, 10 };
		
		
		List<Integer> l1=Arrays.asList(arr1);
		List<Integer> l2=Arrays.asList(arr2);
		List<Integer> l3=Arrays.asList(arr3);

		Set<Integer> st=new HashSet<>();
		st.addAll(l1);
		st.addAll(l2);
		st.addAll(l3);
		
		List<Integer> finalList=new ArrayList<Integer>();
		
		for (Integer s : st) {
			if ((l1.contains(s) && l2.contains(s)) || (l2.contains(s) && l3.contains(s))
					|| (l1.contains(s) && l3.contains(s))) {
				finalList.add(s);
			}
		}
		
		System.out.println(finalList);
		
	}

}
