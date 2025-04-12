package practicejavaprogramsone;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		String st="hare Krishna radhe radhe";
		StringBuffer stb=new StringBuffer();
		for(String str:st.split(" ")) {
			stb.append(reverseWord(str)+" ");
		}
		System.out.println(stb.toString());
		
	}
	
	public static String reverseWord(String word) {
	String reverseWord="";
	
	for(int i=word.length()-1;i>=0;i--) {
		reverseWord+=word.charAt(i);
	}
		return reverseWord;
		
	}
}
