package youtubepractice;

import java.util.Arrays;

public class SecondHighestValueArray {
	
	public static void main(String[] args) {
		int [] arr= {23,3454,235,787,3444,78,345,68,9};
		
		Arrays.sort(arr);
		
		System.out.println("Second highest value is: "+arr[arr.length-2]);
	}

}
