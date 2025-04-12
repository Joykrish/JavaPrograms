package interview.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscending {
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(5, 3, 2, 6, 1, 11, 4);

		Collections.sort(ls);
		
		System.out.println(ls);
		
		List<Integer> sortedList=ls.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

	}
}
