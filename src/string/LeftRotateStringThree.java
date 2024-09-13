package string;

import java.util.Arrays;

public class LeftRotateStringThree {
	
	public static void main(String[] args) {
		String str="HareKrishna";
		char [] arr=str.toCharArray();
		int n=3;
		int size=arr.length;
		for(int j=0;j<=n;j++) {
		char first=arr[0];
		
		for(int i=0;i<size-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[size-1]=first;
		}
		System.out.println(Arrays.toString(arr));
		StringBuffer sb=new StringBuffer();
		for(char c:arr) {
			sb.append(c);
		}
		System.out.println(sb);
		
	}


}
