package practicejavaprogramtwo;

public class FindRepeatatingElementsOfArray {
	
	public static void main(String[] args) {
		int [] arr= {1,3,5,6,3,4,5,6};
		int [] temp=new int[arr.length];
		
		
		for(int i=0;i<arr.length;i++) {
			if(temp[arr[i]]==1) {
				System.out.println(arr[i]);
			}else {
				temp[arr[i]]++;
			}
		}
	}

}
