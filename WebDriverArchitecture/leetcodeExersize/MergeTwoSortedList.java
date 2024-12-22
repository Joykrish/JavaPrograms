package leetcodeExersize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, 1, 2, 4);

		List<Integer> list2 = new ArrayList<>();
		Collections.addAll(list2, 1, 3, 4);

		List<Integer> mergedList = mergeLists(list1, list2);
		System.out.println(mergedList);
	}

	public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
		        List<Integer> mergedList = new ArrayList<>(list1);
		        mergedList.addAll(list2);
		        Collections.sort(mergedList); // Sorts the combined list
		        return mergedList;
		    
		

	}
}
