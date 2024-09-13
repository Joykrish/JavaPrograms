package practice;

import java.util.Arrays;

public class SumArrays {
	public static void main(String[] args) {
int [] arr= {1,47,34,78,12,45};
		
		int sum=Arrays.stream(arr).sum();
		
		System.out.println(sum);
	}

}
