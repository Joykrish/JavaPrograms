package leetcodeExersize;

public class ArrayInsertPosition {
	
	public static void  main(String args[]) {
		int []arr= {1,3,5,6};
		System.out.println("Insert position is"+insertPosition(arr,2));
		
	}
	
	public static int insertPosition(int [] arr,int ele) {
		int left=0;
		int right=arr.length-1;
		
		
		
		while(right>=left) {
			int mid=(left+(right-left)/2);
			if(arr[mid]==ele) {
				return ele;
			}
			else if(ele>arr[mid]) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
			
			
		}
		return left;
	}
	
}
