package practicejavaprogramtwo;

import java.util.Arrays;

public class RightRotatingArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,5,3};
		int last=arr.length;
		int afterrotate=arr[last-1];
		//int last1=arr[arr.length-1];
		
		for(int i=last-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=afterrotate;
		System.out.println(Arrays.toString(arr));
	}

}
