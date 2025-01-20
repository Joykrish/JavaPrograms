package leetcodeExersize;

import java.util.Arrays;

public class SquareSortedArray {
	
	public static void main(String[] args) {
		
		int [] arr= {-2,-5,-3,8,9,7,4};
		
		int [] arr1= {-4,-1,0,3,10};
		System.out.println(Arrays.toString(squareSortedArray(arr1)));
		
	}
	
	public static int [] squareSortedArray(int []arr ) {
		int result[]=new int[arr.length];
		
		int left=0;
		int right=arr.length-1;
		
		for(int i=result.length-1;i>=0;i--) {
			int leftSquare=arr[left]*arr[left];
			int rightSquare=arr[right]*arr[right];
			
			if(leftSquare>rightSquare) {
				result[i]=leftSquare;
				left++;
			}
			else {
				result[i]=rightSquare;
				right--;
			}
			
			
		}
		return result;
	}

}
