package javaExersize.Arrays;

import java.util.Stack;

public class ReverseArrayUsingStack {
	
	public static void main(String[]args) {
		Integer [] arr= {2,5,8,9,5,2,0};
		
		Stack<Integer> st=new Stack<Integer>();
		for(Integer a:arr) {
			st.push(a);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(st.pop());
			
		}
	}

}
