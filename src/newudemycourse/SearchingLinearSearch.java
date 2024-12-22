package newudemycourse;

public class SearchingLinearSearch {
	
	
	public static int  LinearSearch(int [] arr,int num) {
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int [] arr= {1,4,6,2,20,50,24};
		int index=LinearSearch(arr,4);
		System.out.println("Element found at: "+index);
	
	
	if(index==-1) {
		System.out.println("Element not found");
	}

	}
}
