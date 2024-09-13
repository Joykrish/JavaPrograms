package practice;

public class FindDuplicateElementArray {
	public static void main(String[] args) {
		int arr[] = {3,4,5,3,6,4,9,0,6};
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate index is"+i);
					System.out.println("Duplicate element is"+arr[i]);
				}
			}
		}
	}

}
