package javaExersize;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayTwoSumProblem {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=50;
		
		//usingForLoop(arr, sum);
		
		System.out.println(Arrays.toString(usingMap(arr,sum)));
	}

	private static void usingForLoop(int[] arr, int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i] + " "+arr[j]);
				}
			}
		}
	}
	
	public static int [] usingMap(int[] arr, int sum) {
		
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],i);
		}
		
		for(int i=0;i<arr.length;i++) {
			int secondnum=sum-arr[i];
			if(map.containsKey(secondnum)) {
				return new int[] {i,map.get(secondnum)};
			}
		}
		throw new IllegalArgumentException("no Such number found");
	}
	
	

}
