package youtubepractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MajorityElement {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of names you want to sort");
		int n=sc.nextInt();
		String[] arr=new String[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(String a:arr) {
			System.out.println(a);
		}
		
	}
	
	

}
