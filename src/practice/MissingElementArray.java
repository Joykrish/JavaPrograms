package practice;

import java.util.HashSet;

public class MissingElementArray {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,7,8};
		// TODO Auto-generated method stub
		missingElement(arr);
	}
	
	public static void missingElement(int [] arr) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int a:arr) {
			set.add(a);
		}
		
		int n=arr.length+1;
		for(int i=1;i<n;i++) {
			if(!set.contains(i)) {
				System.out.println("missing element is "+i);
			}
		}
		
	}

}
