package javaExersize;

public class EachWorldCharCountString {
public static void main(String[] args) {
	String str="Hare Krishna";
	
 for(int i=0;i<str.length();i++) {
	 String s="";
	 
	 while(i<str.length() && str.charAt(i)!=' ') {
		 s=s+str.charAt(i);
		 i++;
	 }
	 if(s.length()>0) {
		 System.out.println(s+ " "+s.length());
	 }
	 
	 
 }
	
	
}
}
