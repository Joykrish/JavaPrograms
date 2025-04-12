package practicejavaprogramtwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class DisplayArrayElements {

	public static void main(String[] args) {
		
		String [] arr= {"Radha","Madhav","Gauranga","Giridhari","Madhusudan"};
		
		Integer [] arr1= {1,4,6,7,2,63,7,24,63,2};
		
		int [] [] arrtwo=new int[][] {{1,2,3},{5,6,7},{4,8,6}};
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(String str:arr) {
//			System.out.println(str);
//		}
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.asList(arr1));
//		System.out.println(Arrays.deepToString(arrtwo));
		
		Arrays.asList(arr).stream().forEach(s->System.out.println(s));
		
		Arrays.stream(arr).forEach(System.out::prinln);
		
		
	}



}
