package javaExersize.Arrays;

public class FindRepeatingElement {
	
	public static void main(String[] args) {
		
		int arr[]= {1,4,7,6,4,2,7,1,2};
		int temp[]=new int[arr.length];
		
		for(int i=0;i<=arr.length-1;i++) {
			if(temp[arr[i]]==1) {
				System.out.println("Duplicate element is "+arr[i]);
				
			}
			else {
				temp[arr[i]]=1;
			}
			
			
				
		}

}
}