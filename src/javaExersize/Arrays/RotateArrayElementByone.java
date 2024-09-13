package javaExersize.Arrays;

import java.util.Arrays;

public class RotateArrayElementByone {
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		
		int length=arr.length;
		int last=arr[length-1];
		for(int i=length-1;i>0;i--) {
			arr[i]=arr[i-1 ];
		}
		arr[0]=last;
		System.out.println(Arrays.toString(arr));
	}

}
