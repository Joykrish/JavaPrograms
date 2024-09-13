package javaExersize;

import java.util.Arrays;

public class SortedString {

	public static void main(String[] args) {
		String str = "java";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String newStr=new String(ch);
		System.out.println(newStr);
	}

}
