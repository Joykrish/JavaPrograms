package javaExersize.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {1,4,7,9,3,6,8,9,12,5,8,0};
	boolean flag=false;
	int l=0;
	int h=arr.length-1;
	int key=12;
	
	while(l<=h) {
		int m=(l+h)/2;
		if(arr[m]==key) {
			
			flag=true;
			System.out.println("Element found");
			break;
		}
		if(arr[m]<key) {
			l=m+1;
		}
		if(arr[m]>key) {
			h=m-1;
		}
	}
		if(flag==false) {
			System.out.println("Element not found");
		}
		
		
	}
	
	
	
	}

