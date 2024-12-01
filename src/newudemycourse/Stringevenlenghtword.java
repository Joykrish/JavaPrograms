package newudemycourse;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringevenlenghtword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(str);
		
		while(st.hasMoreTokens()) {
			String eachToken=st.nextToken();
			if(eachToken.length()%2==0) {
				System.out.println(eachToken);
			}
		}
		
		System.out.println("----------------------------------------------------");
		
		String[] arr=str.split(" ");
		for(String a:arr) {
			if(a.length()%2==0) {
				System.out.println(a);
			}
		}
		System.out.println("---------------------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
