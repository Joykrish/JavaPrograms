package practicejavaprogramtwo;

import java.util.Arrays;

public class NegativeElementsAtStart {
	
	public static void main(String[] args) {
		int [] arr= {2,5,7,-4,-3,11,-7,9};
		rearrange(arr);
		print(rearrange(arr));
		
		
		
	}
	
	public  static int[] rearrange(int []arr) {
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<0) {
				temp[j]=arr[i];
				j++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0 ) {
				temp[j]=arr[i];
				j++;
			}
		}
		return temp;
		
	}
	
	public static void print(int [] arr) {
		for(int a:arr) {
			System.out.print(a +" ");
		}
	}

}
