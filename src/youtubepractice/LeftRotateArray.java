package youtubepractice;

import java.util.Arrays;

public class LeftRotateArray {
	
	public static void main(String[] args) {
		int arr[]= {23,5,2,7,44,67,235};
		
		int temp=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		
		arr[arr.length-1]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
