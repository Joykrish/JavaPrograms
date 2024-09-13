package javaExersize.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,4,7,9,4,8};
		int index=3;
		
		
		System.out.println("Original Array"+Arrays.toString(arr));
		
		int [] arrnew=IntStream.range(0, arr.length).filter(i->i!=index).map(i->arr[i]).toArray();
		System.out.println("Original Array"+Arrays.toString(arrnew));
	}

}
