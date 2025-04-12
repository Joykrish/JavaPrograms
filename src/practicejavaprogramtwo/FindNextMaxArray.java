  package practicejavaprogramtwo;

public class FindNextMaxArray {
	
	public static void main(String[] args) {
		int arr[]= {25,11,9,8,14,55,130,5,21,90};
		printNextElement(arr);
		
		
	}
	
	public static void printNextElement(int[] arr){
		
		int next;
		
		for(int i=0;i<arr.length;i++) {
			next=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					next=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+","+next);
		}
		
	}

}
