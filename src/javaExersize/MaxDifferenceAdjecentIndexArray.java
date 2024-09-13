package javaExersize;

public class MaxDifferenceAdjecentIndexArray {
	
	public static void main(String []args) {
		int [] arr= {10,20,40,60,120,200};
		System.out.println(maxDifference(arr));
	}
	
	public static int maxDifference(int [] arr) {
		int maxDifference=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]>maxDifference) {
				maxDifference=arr[i+1]-arr[i];
			}
		}
		
		return maxDifference;
		
	}

}
