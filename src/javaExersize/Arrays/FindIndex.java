package javaExersize.Arrays;

public class FindIndex {
	
	public static void main(String[] args) {
	
	int [] Arr={1,6,9,4,6,3,8,2,0};
	
	int element=6;
	
	for(int i=0;i<Arr.length;i++) {
		if(Arr[i]==element) {
			System.out.println("Index of " +element+ " is " + i);
			break;
		}
	}

}
}