package javaExersize.Arrays;

import java.util.Arrays;

public class moveNegativesatStart {
	
	public static void main(String[] args) {
		int [] arr= {-5,1,5,-7,9,-3,7,9,0,-3,-5,7,-2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<0) {
					int temp;
					arr[j]=arr[j]+arr[i];
					arr[i]=arr[j]-arr[i];
					arr[j]=arr[j]-arr[i];
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
