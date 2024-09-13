package javaExersize;

import java.util.Arrays;

public class DeleteArrayElement {
public static void main(String[] args) {
	int [] arr= {1,5,7,8,45,60,19,20};
	int [] newarr=new int[arr.length-1];
	int index=0;
	int elementToBeDeleted=60;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=elementToBeDeleted) {
			newarr[index]=arr[i];
			index++;
		}
	}
	System.out.println(Arrays.toString(newarr));
}
}
