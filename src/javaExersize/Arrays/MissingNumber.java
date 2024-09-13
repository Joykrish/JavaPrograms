package javaExersize.Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,7};
		int sumwithoutmissing=0;
		for(int i=1;i<=arr.length+1;i++) {
			sumwithoutmissing=sumwithoutmissing+i;
		}
		System.out.println(sumwithoutmissing);
		int sumwithmissing=0;
		for(int i:arr) {
			sumwithmissing=sumwithmissing+i;
		}
		System.out.println(sumwithmissing);
		int missing= sumwithoutmissing-sumwithmissing;
		System.out.println("Missing element is " +missing);
	}

}
