package javaExersize.Arrays;

public class MajorityElements {

	public static void main(String[] args) {
		int arr[]= {10,20,10,20,40,20,5};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					if(count>arr.length/2) {
						System.out.println(arr[i] +" is majority");
					}
				
				}
			}
		}
		
	}
}
