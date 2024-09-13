package youtubepractice;

import java.util.Arrays;
import java.util.Collections;

public class SortElmenetINASCDSCOrder {
	public static void main(String[] args) {
		int [] arr= {1,343,63,25645,23,26,342,6};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());
	}

}
