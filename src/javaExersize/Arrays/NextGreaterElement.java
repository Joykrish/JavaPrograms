package javaExersize.Arrays;

import java.util.Arrays;

public class NextGreaterElement {
	
	public static void main(String[] args) {
		int[] arr= {100,3,6,8,1,4,7,9,8,2};
		
		for(int i=0;i<arr.length;i++) {
			int max=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					max=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+"="+max);
		}
		
	}

}
