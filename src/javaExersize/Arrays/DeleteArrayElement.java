package javaExersize.Arrays;

import java.util.Arrays;

public class DeleteArrayElement {
	
	public static void main(String[] args) {
		int [] arr= {1,4,7,9,4,8};
		int index=3;
		int [] newarr=new int[arr.length-1];
		
		for(int i=0,k=0;i<arr.length;i++) {
			if(index!=i) {
				newarr[k]=arr[i];
				k++;
			}
			
		}
		System.out.println(Arrays.toString(newarr));
	}

}
