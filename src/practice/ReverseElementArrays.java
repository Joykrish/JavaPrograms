package practice;

import java.util.Arrays;
import java.util.Stack;

public class ReverseElementArrays {
	
	public static void main(String[] args) {
		
		int [] arr= {1,5,15,20,15};
		
		Stack st=new Stack();
		
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int) st.pop();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
