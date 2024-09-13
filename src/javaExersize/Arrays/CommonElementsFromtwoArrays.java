package javaExersize.Arrays;

public class CommonElementsFromtwoArrays {
	
	public static void main(String[] args) {
		int arr1[]= {2,5,8,9,10,12,16,30};
		int arr2[]= {3,30,12,5,7,8,1,10};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
