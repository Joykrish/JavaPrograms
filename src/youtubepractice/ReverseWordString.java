package youtubepractice;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWordString {
	
	public static void main(String[] args) {
		String str="hare krishna hare rama";
		
		String ch="a";
		int stringLength=str.length();
		
		String newstr=str.replace(ch,"");
		
		int replaceStringLength=newstr.length();
		
		System.out.println("Number of occurance is "+(stringLength-replaceStringLength));
		
		
		

	}

}
