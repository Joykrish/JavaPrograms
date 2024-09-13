package javaExersize.Arrays;

public class FindMaximumDifferenceArrayElement {
	public static void main(String[] args) {
		int [] arr= {4,7,9,4,8,9,10,46,72};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		int Maxdiff=max-min;
		System.out.println(Maxdiff);
		
	}

}
