package leetcodeExersize;

import java.util.Arrays;

public class MeanAfterRemovingElements {
	
	public static void main(String [] args) {
		
		System.out.println(trimMean(new int[] {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0}));
		
	}
	
	public static double  trimMean(int [] arr) {
		
		int length=arr.length;
		
		Arrays.sort(arr);
		
		double limit=0.05*length;
		
		int start=(int)limit;
		
		int end=length-(int)limit;
		
		double sum=0,new_Length=0;
		for(int i=start;i<end;i++) {
			sum=sum+arr[i];
			new_Length++;
			
		}
		
		double avg=sum/new_Length;
		return avg;
		
	}

}
