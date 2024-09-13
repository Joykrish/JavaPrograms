package youtubepractice;

import java.util.HashSet;
import java.util.Set;

public class RepeatingElementArray {
	
	public static void main(String[] args) {
		int [] arr= {2,5,4,67,7,7,4,2,3};
		
		Set<Integer> st=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!st.add(arr[i])){
				System.out.println("Repeating element is"+arr[i]);
		}
	}

}
}
