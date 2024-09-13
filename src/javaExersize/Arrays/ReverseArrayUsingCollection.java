package javaExersize.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayUsingCollection {
	public static void main(String[] args) {
		Integer[] arr= {1,4,6,9,4,6,9};
		List<Integer> ls=Arrays.asList(arr);
		Collections.reverse(ls);
		System.out.println(ls);
	}

}
