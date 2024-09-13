package youtubepractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInarray {
	public static void main(String[] args) {
		int [] arr= {1,23,5,7,8,5,1,45,3,23};
		
		Set<Integer>set=new HashSet<Integer>();
		
		
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				System.out.println("Duplicate elment is "+arr[i]);
			}
		}
		
		
	}

}
