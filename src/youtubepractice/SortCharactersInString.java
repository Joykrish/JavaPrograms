package youtubepractice;

import java.util.Arrays;

public class SortCharactersInString {
	
	public static void main(String[] args) {
		String str="hareKrishanRadhe";
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		
		String st=new String(arr);
		
		System.out.println(st);
		
	}

}
