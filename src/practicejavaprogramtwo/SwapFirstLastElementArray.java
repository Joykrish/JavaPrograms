package practicejavaprogramtwo;

import java.util.Arrays;

public class SwapFirstLastElementArray {
	
	public static void main(String[] args) {
		int [] arr= {1,24,6,8,10,20,15};
		
		
		int temp;
		
		temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
