package practice;

public class LeanearSearchArray {
	public static void main(String[] args) {
		int arr[]= {4,10,15,20,12,24,50,55};
		
		int searchKey=550;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchKey) {
				System.out.println("Index of "+searchKey+" is "+i);
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Element is not found");
		}
		
	}

}
