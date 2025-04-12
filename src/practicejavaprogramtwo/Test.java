package practicejavaprogramtwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {

String str="hareKrishna";

char[] arr=str.toCharArray();
int k=3;

for(int j=1;j<=3;j++) {
char last=arr[arr.length-1];
for(int i=arr.length-1;i>=1;i--) {
	arr[i]=arr[i-1];
	
}
arr[0]=last;
}

StringBuffer sb=new StringBuffer();
for(char c:arr) {
	sb.append(c);
}
System.out.println(sb.toString());
		
}
	
	
	
}