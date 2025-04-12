package practicejavaprogramtwo;

public class MaximumDifferenceArray {
	
	public static void main(String[] args) {
		int [] arr= {10,4,6,8,93,67,50};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum Difference is "+(max-min));
	}

}
