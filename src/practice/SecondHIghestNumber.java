package practice;

import java.util.Arrays;

public class SecondHIghestNumber {
	
	public static void main(String[] args) {
		int[] array= {1,3,30,35,15,20,22,100,50};
		
		Arrays.sort(array);
		
		System.out.println("Second highest number is"+array[array.length-2]);
	}
	
	

}
