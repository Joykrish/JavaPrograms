package practicejavaprogramtwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnagramUsingArrays {

	 public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        
	    System.out.println(isAnagram(str1,str2));    

	      
}
	 
	 public static boolean isAnagram(String s1,String s2 ) {
		 if(s1.length()!=s2.length())
			 return false;
		 int arr[]=new int [26];
		 for(int i=0;i<s1.length();i++) {
			 arr[s1.charAt(i)-'a']++;
			 arr[s2.charAt(i)-'a']--;
		 }
		 
		 for(int a:arr) {
			 if(a!=0) {
				 return false;
			 }
			 
		 }
	return true;
	 }
}
