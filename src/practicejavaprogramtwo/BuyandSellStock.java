package practicejavaprogramtwo;

public class BuyandSellStock {
	public static void main(String[] args) {
	int[] arr= {5,10,25,35,40,20,15};
	
	
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	
	
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(max<arr[i]-min) {
				max=arr[i]-min;
			}
		}
		System.out.println("max value"+max);
	}

}
