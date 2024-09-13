package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemoThree {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,4,6,7,6,9,10);
		List<Integer> mulitpliedList=new ArrayList<Integer>();
		List<Integer> mulitpliedListMap=new ArrayList<Integer>();
		
		for(Integer num:lst) {
			System.out.println(num*3);
			mulitpliedList.add(num*3);
		}
		System.out.println(mulitpliedList);
		
		//using Stream map
		mulitpliedListMap=lst.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println(mulitpliedListMap);
		
	lst.stream().map(num->num*3).forEach(num->System.out.println(num));
	lst.stream().map(num->num*3).forEach(System.out::println);
	}

}
