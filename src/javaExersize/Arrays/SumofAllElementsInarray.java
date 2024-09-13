package javaExersize.Arrays;

public class SumofAllElementsInarray {
	
	public static void main(String[] args) {
		int[] arr= {10,20,40,90,70,30};
		
		sumOfElements(arr);
	}
	
	public static void sumOfElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of Elements in arrays is "+sum);
	}
	

}
