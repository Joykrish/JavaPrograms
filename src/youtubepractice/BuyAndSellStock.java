package youtubepractice;

public class BuyAndSellStock {
	
	public static void main(String[] args) {
		int arr[]= {3,20,30,90,15};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Maximum Profit is: "+(max-min));
		
	}

}
