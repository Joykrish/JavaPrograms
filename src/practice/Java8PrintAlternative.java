package practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8PrintAlternative {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		
		IntStream.range(0, arr.length).filter(i->i%2==0).map(i->arr[i]).forEach(System.out::println);
	}
}
