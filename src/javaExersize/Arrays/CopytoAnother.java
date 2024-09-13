package javaExersize.Arrays;

import java.util.Arrays;

public class CopytoAnother {
	
	public static void main(String[] args) {
		int [] arr= {2,57,6,4};
		usingCopyFunction(arr);
		System.out.println(usingforloop(arr));
		
	}

	private static void usingCopyFunction(int[] arr) {
		int[] newArray=Arrays.copyOf(arr, arr.length);
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
	}
	
	public static String usingforloop(int [] arr) {
		int [] newArray=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArray[i]=arr[i];
		}
		return Arrays.toString(newArray);
	}

}
