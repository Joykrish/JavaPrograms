package leetcodeExersize;

public class ValidMountainArray {
	
	public static void main(String []args) {
		int [ ]arr= {1,2,3,5,6,7,5,4,3,2,1};
		
		
		System.out.println(validMountanArray(arr));
		
		
	}
	
	public static boolean validMountanArray(int arr[]) {
		
		int size=arr.length;
		int i=0;
		int j=size-1;
		if(size<3) return false;
		while(arr[i]<arr[i+1]) {
			i++;
		}
		while(j>0&&i+1<size&&arr[j]<arr[j-1]) {
			j--;
		}
		if(i>0 && j<size-1) {
		if(i==j) {
			return true;
		}
		}
		return false;
	}

}
