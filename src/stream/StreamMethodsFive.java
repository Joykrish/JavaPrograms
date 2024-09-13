package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsFive {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,4,5,6,89,10);
		
		List<Integer> sortedList=list1.stream().sorted().collect(Collectors.toList());//ascending order
		System.out.println(sortedList);
		List<Integer> sortedListreverse=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedListreverse);
		
		
		List<String> namesList=Arrays.asList("hare","krishna","rama","govinda","madhav");
		
		List<String> namesListsorted=namesList.stream().sorted().collect(Collectors.toList());
		System.out.println(namesListsorted);
		List<String> namesListsortedReverse=namesList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(namesListsortedReverse);
		
		
		
	}

}
