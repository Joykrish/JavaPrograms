package javaExersize.Arrays;

import java.util.Arrays;

public class ZeroAtEnd {
public static void  main(String[] args) {
	int arr[]= {1,2,0,2,0,3,8,6,0,0,8};
	
	
	//methodone(arr);
	System.out.println(methodtwo(arr));
}

private static void methodone(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=arr.length-1;j>=0;j--) {
			if(arr[i]==0) {
				
				arr[i] = arr[i] + arr[j];
				arr[j] = arr[i] - arr[j];
				arr[i] = arr[i] - arr[j];
				break;
				
		}
	}
}
	System.out.println(Arrays.toString(arr));
}

public static String methodtwo(int [] arr) {
	int [] temp=new int [arr.length];
	int j=0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]!=0) {
			temp[j]=arr[i];
			j++;
		}
	}
	return Arrays.toString(temp);
}

}