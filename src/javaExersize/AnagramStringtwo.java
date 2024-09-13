package javaExersize;

import java.util.Arrays;

public class AnagramStringtwo {
public static void main(String[] args) {
	String str1="Hare";
	String str2="reaH";
	System.out.println("Strings are anagram "+ checkAnagram(str1,str2));
	
}
public static boolean  checkAnagram(String str1,String str2) {
	
	char array1[]=str1.toCharArray();
	char array2[]=str2.toCharArray();
	
	Arrays.sort(array1);
	Arrays.sort(array2);
	
	return Arrays.equals(array1, array2);
}
}
