package practice;

import java.util.stream.IntStream;

public class SumOfallELmenetnArray {

	public static void main(String[] args) {
		
		int [] array= {1,3,5,6,8,9,5,4};
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println(sum);
		
		int sum1=IntStream.of(array).sum();
		System.out.println(sum1);
	}

}
