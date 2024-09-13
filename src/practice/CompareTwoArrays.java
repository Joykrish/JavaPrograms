package practice;

public class CompareTwoArrays {
	public static void main(String[] args) {
		int arr1 []= {1,2,3,4,5,2};
		int arr2 []= {1,2,3,4,5,6};
		
		boolean  isSame=true;
		
		if(arr1.length!=arr2.length) {
			isSame=false;
		}
		else {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					isSame=false;
					break;
				}
			}
			
		}
		
		System.out.println("Two arrays are equal:"+isSame);
		
	}

}
