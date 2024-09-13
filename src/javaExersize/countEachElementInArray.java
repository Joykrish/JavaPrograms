package javaExersize;

import java.util.ArrayList;

public class countEachElementInArray {
	
	public static void main(String [] args) {
	int [] arr= {4,5,5,5,4,6,6,9,4};
	
	ArrayList<Integer> ls=new ArrayList<Integer>();
	
	for(int i=0;i<arr.length;i++) {
		int k=0;
		if(!ls.contains( arr[i])) {
			ls.add(arr[i]);
			k++;
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				k++;
				
			}
			
		}
		System.out.println(arr[i] +" "+k);	
	}
	
	

}
}
}