package string;

import java.util.Arrays;

public class LeftRotateStringbyOnePosition {
public static void main(String[] args) {
	String str="HareKrishna";
	char []arr=str.toCharArray();
	int size=arr.length;
	char first=arr[0];
	
	for(int i=0;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
		
	}
	arr[size-1]=first;
	
	System.out.println(Arrays.toString(arr));
	
	StringBuffer sb=new StringBuffer();
	for(char c:arr) {
		sb.append(c);
	}
	
	System.out.println("String after left roation of 1 character is " + sb);
	
}
}
