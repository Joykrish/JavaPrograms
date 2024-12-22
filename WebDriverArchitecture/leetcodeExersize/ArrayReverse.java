package leetcodeExersize;

import java.util.Arrays;

public class ArrayReverse {
	
	public static void main(String[] args) {
		int [] arr= {3,5,6,2,10,5,11,3,15};
		
		int start=0;
		int end=arr.length-1;
		
		while(end>start) {
			int ch=arr[start];
			arr[start]=arr[end];
			arr[end]=ch;
			start++;
			end--;
		}
		
		System.out.println("reverse of array:  "+Arrays.toString(arr));
		
		
		
	}

}
