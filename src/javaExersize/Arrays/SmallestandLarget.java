package javaExersize.Arrays;

public class SmallestandLarget {
	public static void main(String[] args) {
		
		int [] arr= {2,4,6,3,5,34,63,24,34,21,20};
		
		int smallest=arr[0];
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>largest) {
					largest=arr[i];
				}
				
				if(arr[i]<smallest) {
					smallest=arr[i];
				}
				
				
			}
			
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
