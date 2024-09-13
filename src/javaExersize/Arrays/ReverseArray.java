package javaExersize.Arrays;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int [] arr= {1,6,8,9,37,5,8,90};
	
	int [] rev=new int[arr.length];
	
	for(int i=arr.length-1,k=0;i>=0;i--) {
		rev[k]=arr[i];
		k++;
	}
	
	System.out.println(Arrays.toString(rev));
}
}
