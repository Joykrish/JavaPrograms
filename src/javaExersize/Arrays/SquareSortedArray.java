package javaExersize.Arrays;

public class SquareSortedArray {
	
	public static void main(String[] args) {
		String str1="abc";
		String str2="cat";
		System.out.println(isAnagram(str1,str2));
		
	}
	
	public static boolean isAnagram(String string,String string1) {
		int [] count=new int[256];
		
		for(int i=0;i<string.length();i++) {
			count[string.charAt(i)]++;
			count[string1.charAt(i)]--;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}

}
