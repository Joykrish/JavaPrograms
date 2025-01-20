package leetcodeExersize;

public class BestTimetoBuyandSellStock {
	
	
	
	public static void main(String args[]) {
		
		int days[]= {7,1,5,3,6,4};
		System.out.println(MaxProfit(days));  
		
	}
	
	public static int MaxProfit(int [] arr) { 
		int min=Integer.MAX_VALUE;
		int MaxProfit=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			int currentProfit=arr[i]-min;
			if(currentProfit>MaxProfit) {
				MaxProfit=currentProfit;
			}
		}
		return MaxProfit;
	}

}
