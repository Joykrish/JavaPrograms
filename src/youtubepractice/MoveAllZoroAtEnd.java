package youtubepractice;

import java.util.Arrays;

public class MoveAllZoroAtEnd {
public static void main(String[] args) {
	
	
	int [] arr= {1,0,5,3,0,4,0,7};
	
	int [] arranged=new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]!=0) {
			arranged[j]=arr[i];
			j++;
		}
		
	}
	System.out.println(Arrays.toString(arranged));
}
}
