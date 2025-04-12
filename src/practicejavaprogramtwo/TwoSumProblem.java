package practicejavaprogramtwo;

public class TwoSumProblem {
	public static void main(String[] args) {
		int [] arr= {10,30,20,25,40,25};
		int sum=50;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]+arr[j]==sum) {
					System.out.println(arr[i] +"+"+arr[j]+"="+sum);
				}
			}
		}
	}

}
 