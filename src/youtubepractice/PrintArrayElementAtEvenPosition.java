package youtubepractice;

public class PrintArrayElementAtEvenPosition {
	public static void main(String[] args) {
		int [] arr= {1,35,67,3,7,38,44,66,34,26};
		
		
		for(int i=0;i<arr.length;i=i+2) {
		System.out.println(arr[i]);
		}
	}

}
