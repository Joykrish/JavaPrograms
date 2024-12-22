package leetcodeExersize;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		 String [] arr= {"flower","flow","flight"};
		 
		 System.out.println(longestPrefix(arr));
	}
	
	
	public static String longestPrefix(String [] arr) {
		if(arr[0].length()==0||arr==null) {
			return "";
		}
		
		for(int i=0;i<arr[0].length();i++) {
			char a=arr[0].charAt(i);
			
			for(int j=1;j<arr.length;j++) {
				if(i==arr[j].length()||arr[j].charAt(i)!=a) {
					return arr[0].substring(0,i);
				}
			}
		}
		
		return arr[0];
	}

}
