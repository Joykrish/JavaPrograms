package javaExersize;

public class MinMaxArray {
	
	public static void main(String[] args) {
	
	int [] arr= {23,45,78,14,16,20,90,30};
	int max=arr[0];
	int min=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<min) {
				min=arr[j];
			}
		}
	}
System.out.println("Max is "+max);
System.out.println("Min is "+min);
}
}
