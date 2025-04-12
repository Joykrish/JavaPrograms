package practicejavaprogramtwo;

import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringSplit {
	public static void main(String[] args) {
		String s="0808-3242343";
		String arr[]=s.split("-");
		printString(arr,"String split method");
		
		List<String> strings=Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
		
		for(String s1:strings) {
			System.out.println("Split string using approach ");
			System.out.println(s1);
			
		}
		StringTokenizer Strings=new StringTokenizer(s,"-");
		while(Strings.hasMoreTokens()) {
			String s2=Strings.nextToken();
			System.out.println(s2);
		}
		
		
	}
	
	public static void printString(String[] arr,String approach) {
		System.out.println("Split string using: "+approach);
		
		for(String s:arr) {
			System.out.println(s);
		}
	}
	

}
