package string;

import java.util.Arrays;

public class RightRotateByThreeCharacters {
	
	public static void main(String[] args) {
		String str="HareKrishna";
		char[] arr=str.toCharArray();
		int size=arr.length;
		int n=3;
		for(int j=0;j<=n;j++) {
		
		char last=arr[size-1];
		
		for(int i=size-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
		StringBuffer sb=new StringBuffer();
		for(char c:arr) {
			sb.append(c);
		}
		System.out.println(sb);
		
		
	}
	
}
