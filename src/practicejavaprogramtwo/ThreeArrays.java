package practicejavaprogramtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeArrays {
	public static void main(String[] args) {
		Integer a1[] = { 1, 2, 3, 9, 8, 7 };     
		Integer a2[] = { 4, 1, 2, 10, 15 };
		Integer a3[] = { 5, 1, 2, 4, 10 };

		HashSet<Integer> hs = new HashSet<Integer>();
		List<Integer> l1 = Arrays.asList(a1);
		List<Integer> l2 = Arrays.asList(a2);
		List<Integer> l3 = Arrays.asList(a3);

		hs.addAll(l1);
		hs.addAll(l2);
		hs.addAll(l3);
		
		List<Integer> finalList=new ArrayList<Integer>( );

		for (Integer ele : hs) {
			if ((l1.contains(ele) && l2.contains(ele)) || (l2.contains(ele) && l3.contains(ele))
					|| (l1.contains(ele) && l3.contains(ele))) {
				finalList.add(ele);

			}
		}
		
		for(Integer a:finalList) {
			System.out.println(a);
		}
	}

}
