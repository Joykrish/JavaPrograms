package practice;

import java.util.Arrays;

public class StringAnagram {
	
	public static void  main(String[] args) {
		String s1="harekrishna";
		String s2="haerkrishan";
		
		char[] arrs1=s1.toLowerCase().toCharArray();
		char[] arrs2=s2.toLowerCase().toCharArray(); 
		
		
		Arrays.sort(arrs1);
		Arrays.sort(arrs2);
		
		System.out.println(Arrays.equals(arrs1, arrs1));
		
		if(Arrays.equals(arrs1, arrs2)) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}

}
