package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter {
	
	public static void main(String[] args) {
//		List<Integer>numberList=new ArrayList<Integer>();
//		
//		numberList.add(10);
//		numberList.add(15);
//		numberList.add(18);
//		numberList.add(23);
//		numberList.add(26); 
//		numberList.add(29);
//		numberList.add(30);
//		
//		System.out.println(numberList);
		
		List<Integer> numList=Arrays.asList(10,15,18,21,24,25,28,30);
		List<Integer> evenNumberList=new ArrayList<Integer>();
		
//		
//		//without stream
//		
//		for (Integer number : numList) {
//			if (number%2==0) {
//				evenNumberList.add(number);
//			} 
//			
//		}
//		
	//System.out.println(evenNumberList);
	
		//with stream
		
		//evenNumberList=numList.stream().filter(n->n%2==0).collect(Collectors.toList());
		numList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		//numList.stream().filter(n->n%2==0).forEach(System.out::println);
		//System.out.println(evenNumberList);
		
		
		
	}

}
