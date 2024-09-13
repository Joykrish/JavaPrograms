package youtubepractice;

public class FindFirstDuplicateOccurance {
	
	
	public static void main(String[] args) {
		int [] arr= {1,21,34,5,6,2,34,5};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
				 System.out.println("First duplicate occurance: "+arr[i]);
				 return;
				}
			}
		}
		
		
	}

}
