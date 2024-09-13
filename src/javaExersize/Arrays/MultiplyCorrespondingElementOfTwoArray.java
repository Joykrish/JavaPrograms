package javaExersize.Arrays;

import java.util.Arrays;

public class MultiplyCorrespondingElementOfTwoArray {
	
	public static void main(String[] args) {
		int a[]= {1,4,6,7,3};
		int b[]={5,4,8,2,9};
		
		int [] multiply=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			multiply[i]=a[i]*b[i];
			
		}
		System.out.println(Arrays.toString(multiply));
	}

}
