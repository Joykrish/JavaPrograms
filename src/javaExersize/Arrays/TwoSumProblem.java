package javaExersize.Arrays;

public class TwoSumProblem {
	
	public static void main(String[] args) {
	int [] arr= {2,5,8,4,19,5,10,6};
	int sum=10;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==sum) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}

}
}
