package javaExersize.Arrays;

public class FindRepeatingelementusingFor {
public static void main(String[] args) {
	int [] arr= {1,4,7,6,4,2,7,1,2};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("Duplicate Element is "+arr[i]);
			}
		}
	}
	
}
}
