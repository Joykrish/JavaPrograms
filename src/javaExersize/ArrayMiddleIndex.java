package javaExersize;

public class ArrayMiddleIndex {
public static void  main(String[] args) {
	int arr1[]= {2,4,6,7,9,10,12,15,10};
	System.out.println(findMiddleElement(arr1));
}
	
	
public static int findMiddleElement(int arr[]) {
	if(arr==null ||arr.length==0) {
		throw new IllegalArgumentException("Please enter the elementsin array");
	}
	
	int middleIndex=arr.length/2;
	
	if(arr.length%2!=0) {
		return arr[middleIndex];
	}
	
	else {
		return arr[middleIndex-1];
	}
}
}
