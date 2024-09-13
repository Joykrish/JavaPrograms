package practice;

public class ArrayElementatevenPosition {
	public static void main(String[] args) {
		int [] arr= {1,4,5,7,8,9,10,11,15,18};
		
		 for(int i=2;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		 }
	}

}
