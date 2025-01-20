package practice;

public class ShuffleString {
	
	public static void main(String[] args) {
		
		int [] arr1= {4,5,6,7,0,2,1,3};
		
		
		System.out.println(shuffleString(arr1,"codeleet"));
		
	}
	
	public static String  shuffleString(int [] arr,String str) {
		
		if(str.length()!=arr.length) {
			return "Please enter same lenght string and array";
		}
		
		char[] string=str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			
			string[arr[i]]=str.charAt(i);
			
		}
		return new String(string);
		
	}

}
