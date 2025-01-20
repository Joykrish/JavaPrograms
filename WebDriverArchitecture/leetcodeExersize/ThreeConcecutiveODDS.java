package leetcodeExersize;

import java.util.Stack;

public class ThreeConcecutiveODDS {
	
	public static void main(String[]args) {
		System.out.println(verifyThreeOdd(new int[] {1,2,34,3,4,5,7,23,12}));
		System.out.println(verifyThreeOddForLoop(new int[] {1,2,34,3,4,5,7,23,12}));
	}
	
	public static boolean verifyThreeOdd(int [] arr) {
		
		Stack<Integer> st=new Stack<Integer>();
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				st.push(arr[i]);
				if(st.size()==3) {
					return true;
				}
			}
			else {
				st.clear();
			}
		}
		
		
		
		return false;
		
		
		
		 
	}
	
	public static boolean verifyThreeOddForLoop(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				count++;
				if(count==3) {
					return  true;
				}
			}
			else {
				count=0;
			}
		}
		return false;
		
	}
	
	

}
