package leetcodeExersize;

import java.util.Arrays;

public class RunningSum1DArray {
	
	public static void main(String[] args) {
		int [] arr= {1,4,6,5,10};
		
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]+arr[i-1];
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
