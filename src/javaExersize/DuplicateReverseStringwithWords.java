package javaExersize;

public class DuplicateReverseStringwithWords {
	
	public static void main(String[] args) {
	
	String str="Hare Krishan Rama";
	
	String[] arr=str.split(" ");
	
	String reverseString="";
	String reverseword="";
	
	for(int i=arr.length-1;i>=0;i--) {
		String Word=arr[i];
		//reverseString=reverseString+" "+arr[i];
		for (int j=Word.length()-1;j>=0;j--) {
			
			reverseword=reverseword+Word.charAt(j);
		}
		
	}
	reverseString=reverseString+reverseword+"  ";
	System.out.println(reverseString);
}
}