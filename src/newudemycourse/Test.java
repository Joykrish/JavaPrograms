package newudemycourse;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int [] arr= {1,2,-1,5,-6,9,-2,10};
		int [] arr1= new int[arr.length];
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr1[j]=arr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr1[j]=arr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}
