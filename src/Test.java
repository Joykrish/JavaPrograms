import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int [] arr= {2,4,3,1,7,8,5};
		
		Arrays.sort(arr);
		
		int max=arr[arr.length-2];
		System.out.println(max);
	}

}
