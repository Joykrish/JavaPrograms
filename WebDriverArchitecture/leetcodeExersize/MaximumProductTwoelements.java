package leetcodeExersize;

import java.util.Arrays;

public class MaximumProductTwoelements {
	
	
	public static void main(String args[]) {
	int arr[]= {8,9,5,1,2,4,5,6};
	Arrays.sort(arr);
	int max=arr[arr.length-1];
	int maxNext=arr[arr.length-2];
	
	int maxProduct=  (max-1)*(maxNext-1);
	System.out.println(maxProduct);
	
	
	}

}
